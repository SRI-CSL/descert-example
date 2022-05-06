#!/usr/bin/env python
# Copyright SRI International, 2015 - present.

import os
import subprocess

import common
from utils import create_logger

logger = create_logger(__file__)


# TODO(has) - replace this with common.run_cmd
def run_cmd(cmd, stdout=logger.info, stderr=logger.error):
    stats = {"output": ""}

    cmd_str = " ".join(cmd)

    stdout("Running command '%s'", cmd_str)

    process = subprocess.Popen(cmd,
                               stdout=subprocess.PIPE,
                               stderr=subprocess.STDOUT)
    for line in iter(process.stdout.readline, b""):
        line = line.decode("utf-8")
        stats["output"] = stats["output"] + line
        stdout(line)
    process.stdout.close()
    process.wait()

    stats["return_code"] = process.returncode
    if process.returncode != 0:
        stderr("Failed to run '%s', check corpus.log for details.", cmd_str)

    return stats


def run_hg(subcommand, args=None, opts=None):
    cmd = ["hg", subcommand]
    if opts:
        cmd.extend(opts)
    if args:
        cmd.extend(args)

    return run_cmd(cmd)


def run_git(subcommand, args=None, opts=None):
    cmd = ["git", subcommand]
    if opts:
        cmd.extend(opts)
    if args:
        cmd.extend(args)

    return run_cmd(cmd)


def hg_update(project):
    if project["hg-url"] not in run_cmd(["hg", "paths"])["output"]:
        logger.info(
            "hg_url for '%s' has changed. Please delete dir to redownload.",
            project["name"],
        )
        return
    if project["hg-ref"] not in run_cmd(["hg", "identify"])["output"]:
        logger.info("Checking out hg ref '%s'.", project["hg-ref"])
        run_hg("pull")
        run_hg("revert", ["-a", "--no-backup"])
        run_hg("update", ["-c", project["hg-ref"]])


def git_update(project):
    if project["git-url"] not in run_cmd(["git", "remote", "-v"])["output"]:
        logger.info(
            "git_url for '%s' has changed. Please delete dir to redownload.",
            project["name"],
        )
        return
    if ("git-ref" in project and project["git-ref"] not in run_cmd(["git", "rev-parse", "HEAD"])["output"]):
        logger.info("Checking out git ref '%s'.", project["git-ref"])
        run_git("fetch")
        run_git("reset", ["--hard"])
        run_git("checkout", [project["git-ref"]])


def download_project(project):
    if not os.path.isdir(project["name"]):
        if "git-url" in project:
            opts = None
            if "git-opt" in project:
                opts = project["git-opt"].split()
            logger.debug("Downloading '%s'.", project["name"])
            run_git("clone", [project["git-url"], project["name"]], opts=opts)
        elif "hg-url" in project:
            logger.debug("Downloading '%s'.", project["name"])
            run_hg("clone", [project["hg-url"], project["name"]])
    else:
        logger.debug("Already downloaded '%s'.", project["name"])


def clean_project(project_name):
    info = common.project_info(project_name)
    project_dir = common.get_corpus_project_dir(project_name, info=info)

    if not os.path.exists(project_dir):
        return

    with common.cd(project_dir):
        clean_command = info["clean"].strip().split()
        run_cmd(clean_command)
        run_cmd(["rm", "-r", common.DLJC_OUTPUT_DIR])

        if "git-url" in info:
            run_cmd(["git", "reset", "--hard", "HEAD"])
            run_cmd(["git", "clean", "-dxf", "."])


def build_project(project_name):
    info = common.project_info(project_name)
    project_dir = common.get_corpus_project_dir(project_name, info=info)

    if not os.path.exists(project_dir):
        return

    if "build" not in info:
        return

    with common.cd(project_dir):
        logger.debug("Cleaning '%s'", project_name)
        clean_project(project_name)
        logger.debug("Building '%s", project_name)
        common.run_dljc(project_name)


def update_project(project, tempdir):
    project_dir = os.path.join(tempdir, project["name"])
    with common.cd(project_dir):
        if "git-url" in project:
            git_update(project)
        elif "hg-url" in project:
            # Mercurial support
            hg_update(project)


def fetch_project(project_name, srcdir, tempdir):
    project_dir = None
    with common.cd(tempdir):
        project = common.get_corpus_info()["projects"][project_name]
        download_project(project)

        project_dir = os.path.join(os.path.join(tempdir, project["name"]))
        if not os.path.isdir(project_dir):
            logger.info("'%s' not available.", project["name"])
            return

        update_project(project, tempdir)
    # move each temp/project to its final destination
    if project_dir:
        common.move(project_dir,
                    os.path.join(os.path.join(srcdir, project["name"])))


def fetch_single_project(project_name, srcdir, tempdir):
    with common.cd(tempdir):
        fetch_project(project_name, srcdir, tempdir)
        logger.debug("Downloaded %s project", project_name)

    return project_name


def build_single_project(project_name, srcdir, build=False):
    with common.cd(srcdir):
        if build:
            build_project(project_name)
            logger.debug("Built %s project", project_name)

    return project_name


def fetch_and_build_projects(projects, srcdir, tempdir, build=False):
    fetched_projects = set()
    for project_name in projects:
        fetched_projects |= {
            fetch_single_project(project_name, srcdir, tempdir)
        }
        fetched_projects |= {
            build_single_project(project_name, srcdir, build=build)
        }

    logger.info("Processed repos %s'", ",".join(fetched_projects))


if __name__ == "__main__":
    pass
