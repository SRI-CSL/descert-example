#!/usr/bin/env python
# Copyright SRI International, 2020 - present.

import os
import typing as ty
from dataclasses import dataclass
from pathlib import Path
from tempfile import TemporaryDirectory

import click
from dataclass_csv import DataclassReader, DataclassWriter

import cli as cl
import common
import executor
import fetch
import utils

logger = utils.create_logger(__file__)


@dataclass(frozen=True)
class RepoInfo:
    project: str
    src_dir: str
    out_dir: str
    project_dir: str
    build: bool


def git_clone_task(task: executor.Task) -> RepoInfo:
    if not task:
        raise TypeError('Invalid task object')

    if common.CORPUS_DIR != task.homedir:
        raise ValueError("ERROR: CORPUS_DIR != task.homedir")

    temp_dir = TemporaryDirectory()
    temp_dir_path = Path(temp_dir.name)

    fetch.fetch_and_build_projects([task.project], task.homedir, temp_dir_path,
                                   task.build)
    # thx to https://stackoverflow.com/questions/50649701
    temp_dir.cleanup()

    project_dir = os.path.join(task.homedir, task.project)
    return RepoInfo(project=task.project,
                    src_dir=task.homedir,
                    out_dir=task.outdir,
                    project_dir=project_dir,
                    build=task.build)


def git_repos(repos: cl.Repos, projs_to_fetch: ty.List[str],
              build: bool) -> ty.Tuple[bool, ty.List[RepoInfo]]:
    logger.info("Downloading software repositories")
    if not os.path.exists(repos.homedir):
        logger.error("Failed to locate '%s' dir", repos.homedir)
        return False, None

    # repos.homedir remains a user provided directory;
    # however, srcdir and outdir are hardcoded.
    repos.outdir = common.set_output_dir(repos.subdir("outdir"))
    repos.homedir = common.set_corpus_dir(repos.subdir("srcdir"))

    tasks = []
    for idx, proj in enumerate(projs_to_fetch):
        task = executor.Task()
        task.name = str(idx)
        task.homedir = repos.homedir
        task.outdir = repos.outdir
        task.project = proj
        task.build = build
        tasks += [task]

    results = []
    if len(tasks) < 10:
        # no need for concurrent fetching of repositories
        for task in tasks:
            results += [git_clone_task(task)]
    else:
        results = executor.execute_batch_parallel(tasks,
                                                  git_clone_task,
                                                  desc='git clone',
                                                  transf_fn=lambda x: x)
    if len(results) == 0:
        logger.error("Failed to clone %d repositories", len(projs_to_fetch))
        return False, None

    repos_info_file = os.path.join(repos.homedir, "repos_info.csv")
    with open(repos_info_file, "w") as f:
        try:
            w = DataclassWriter(f, results, RepoInfo)
            w.write()
        except Exception:
            logger.error("Failed to write '%s'", repos_info_file)
            return False, None

    return True, results


def get_cloned_repos(repos: cl.Repos) -> ty.Optional[ty.List[RepoInfo]]:
    repos_info_file = os.path.join(repos.homedir, "repos_info.csv")
    try:
        repo_info_csv = open(repos_info_file, 'r')
    except OSError:
        logger.error(f'Failed to read %s', repos_info_file)
        return None

    repo_info_reader = DataclassReader(repo_info_csv, RepoInfo)
    results = [repo_info for repo_info in repo_info_reader]
    return results


def git_repos_in_corpus(repos: cl.Repos, corpus_json_file: str, rs,
                        build: bool) -> ty.Optional[ty.List[RepoInfo]]:
    
    if repos.force:
        # instead of deleting the `corpus` dir, let's rotate it
        # first to keep results from previous execution. After
        # that we can re-make it.
        common.rotate_dir(repos.homedir)
        repos.mkdir()
    
    if not os.path.exists(corpus_json_file):
        logger.warning('%s cannot be located.', corpus_json_file)
        return None

    # mark corpus json as the corpus file
    common.set_corpus_file(corpus_json_file)

    if not os.path.exists(os.path.join(repos.homedir, "srcdir")):
        # determine which GitHub repositories to fetch
        to_fetch = None
        if len(rs) == 1:
            setname = rs[0]
            logger.debug("fetch '%s' repo set", setname)
            to_fetch = common.get_corpus_set(setname)
            logger.debug("'%s'", ", ".join(to_fetch))
        else:
            # get a fresh copy of rs
            to_fetch = rs[:]

        # git (clone) repositories and then if successful
        # return a list of task result objects.
        success, results = git_repos(repos, to_fetch, build=build)
        if not success:
            logger.debug("Failed to download repos in '%s'", repos.homedir)
            return None
    else:
        # No need to clone needed repos; however, let's recover
        # their info and then return it as output
        repos.outdir = common.set_output_dir(repos.subdir("outdir"))
        repos.homedir = common.set_corpus_dir(repos.subdir("srcdir"))

        results = get_cloned_repos(repos)
        if len(results) == 0:
            return None
        logger.info("Recovered %d repos from '%s'", len(results),
                    repos.homedir)

    return results


def run_descert(repos: cl.Repos, cloned_projects: ty.List[RepoInfo], tools: ty.List[str], opts: ty.List[str], classlist: str) -> dict:
    cloned_projects = cloned_projects or []
    
    if not tools or len(tools) == 0:
        raise ValueError("Missing tools to execute!")
  
    opts = [] if opts is None else list(opts)
    if "all" in tools:
        tools = ['randoop', 'chicory', 'csve']
        # if all, use all options
        opts = ['--daikon-xml', '--evidence-json']
    else:
        tools = list(tools) if tools else []

    # if it's not None then must exists. 
    # `click.Path` option will guarantee this.
    if 'randoop' in tools and classlist is not None:
        opts += ['--classlist-txt', os.path.join(classlist)]

    out_dict = {}
    for each_cloned in cloned_projects:
        module_dir = common.get_module_dir(each_cloned.project)
        if module_dir is not None:
            opts += ['--module-dir', module_dir]
        if len(opts) == 0:
            opts = None
        
        stats = common.run_dljc(
            each_cloned.project,
            # the `csve` tool gets the *-evidence.json generated
            # by randoop and daikon dljc-processes and then turns
            # them into a collection of csv files. These
            # csv files match Honeywell's ontology and can be ingested
            # by rack-in-the-box
            # tools=['randoop'],
            # tools=['chicory'],
            # tools=['randoop', 'chicory', 'csve'],
            tools=tools,
            # options=['--daikon-xml', '--evidence-json'])
            # options=['--daikon-xml'])
            # options=['--evidence-json'])
            options=opts)
        
        if stats or stats is not None or len(stats) > 0:
            out_dict[each_cloned.project] = stats

    return out_dict


@cl.cli.command("fetch-deps", help="Download needed dependencies")
@cl.pass_repos
def fetch_deps_cmd(repos):
    # downloads all resources needed for this project.
    success, status = common.install_deps(repos)

    if not success:
        click.echo("Unable to download dnd-cli's dependencies. Try again.")
        return

    logger.debug("installed dljc in '%s's", str(status["elapsed"]))
    click.echo("tools and resources have been installed.")


@cl.cli.command("fetch-repos", help="Download needed repositories")
@click.option(
    "--repo-set",
    "rs",
    multiple=True,
    default=["all"],
    help="Named set of repositories to clone/build",
)
@click.option(
    "--build/--no-build",
    default=False,
    help="Build cloned repositories")
@cl.pass_repos
def fetch_repos_cmd(repos, rs, build):    
    corpus_json_file = os.path.join(common.DATA_DIR, 'corpus.json')
    # downloads all resources needed for this project.
    repos_info_out = git_repos_in_corpus(repos, corpus_json_file, rs, build)

    if repos_info_out is None:
        click.echo(
            f"Unable to download GitHub repositories in {corpus_json_file}.")
        return

    click.echo("Downloaded repositories:\n")
    click.echo('\n'.join([
        f"\t{repo_info.project}: {repo_info.project_dir}"
        for repo_info in repos_info_out
    ]))


@cl.cli.command("get-evidence", help="Generate DesCert evidence data")
@click.option(
    "--tool",
    "tools",
    multiple=True,
    type=click.Choice(['randoop', 'chicory', 'csve', 'all']),
    default=["all"],
    help="List of do-like-javac tools to execute",
)
@click.option(
    "--tool-option",
    "opts",
    multiple=True,
    type=click.Choice(['--daikon-xml', '--evidence-json', '--error-driver', '--override-evidence']),
    default=None,
    help="Addons to forward to do-like-javac tools",
)
@click.option(
    "--randoop-classlist-txt",
    "classlist",
    type=click.Path(exists=True, resolve_path=True),
    default=None,
    help="Randoop's classlist.txt file",
)
@cl.pass_repos
def run_descert_cmd(repos, tools, opts, classlist):
    # make sure we look in the right directories
    repos.outdir = common.set_output_dir(repos.subdir("outdir"))
    repos.homedir = common.set_corpus_dir(repos.subdir("srcdir"))
    
    corpus_json_file = os.path.join(common.DATA_DIR, 'corpus.json')
    common.set_corpus_file(corpus_json_file)

    repos_info_out = get_cloned_repos(repos)
    if not repos_info_out or repos_info_out is None:
        click.echo(f"Failed to retrieve repos from {repos.homedir}.")
        return

    dljc_out = run_descert(repos, repos_info_out, tools, opts, classlist)
    if not dljc_out or dljc_out is None:
        click.echo("Failed to run DesCert. Check logs for additional info.")
        return
    
    if repos.debug:
        click.echo(dljc_out)


if __name__ == "__main__":
    # FYI - (d)escert-a(n)d-(d)o-like-javac-cli => dnd-cli
    cl.cli()
