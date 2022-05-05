#!/usr/bin/env python
# Copyright SRI International, 2015 - present.
import copy
import fnmatch
import json
import logging
import os
import re
import shutil
import subprocess
import sys
import traceback
from contextlib import contextmanager
from enum import Enum
from threading import Timer

from tqdm import tqdm

from . import utils

logger = utils.create_logger(__file__)

WORKING_DIR = os.path.dirname(os.path.realpath(__file__))
OUTPUT_DIR = os.path.join(WORKING_DIR, "graphs")
CORPUS_DIR = os.path.join(WORKING_DIR, "corpus")
CORPUS_INFO = None
DREQS = os.path.join(WORKING_DIR, ".reqs.d")
TOOLS_DIR = os.path.join(DREQS, "tools")
LIBS_DIR = os.path.join(DREQS, "libs")
DATA_DIR = os.path.join(DREQS, "data")

if os.environ.get("DLJCDIR"):
    DLJC_BINARY = os.path.join(os.environ.get("DLJCDIR"), "dljc")
else:
    DLJC_BINARY = os.path.join(TOOLS_DIR, "do-like-javac", "dljc")
DLJC_OUTPUT_DIR = "dljc-out"

class Result(Enum):
    ERROR = 1
    SUCCESS = 2
    IGNORE = 3
    
class Graph(Enum):
    AUG = 1  # default
    P2D = 2
    UNK = 3  # unknown graph
    
    @classmethod
    def supports(graph_type: str) -> bool:
        return graph_type in Graph.__members__

class Project:
    def __init__(self):
        pass

class JavaClass:
    def __init__(self):
        pass

class Method:
    def __init__(self, project=None, methodname=None, dotfile=None, score=0.0):
        self.project = project
        self.methodname = methodname
        self.dotfile = dotfile
        self.score = score

def get_jar(jar_name):
    path = os.path.join(LIBS_DIR, jar_name)
    if os.path.isfile(path):
        return path
    return None

def get_py(py_name):
    path = os.path.join(WORKING_DIR, py_name)
    if os.path.isfile(path):
        return path
    return None

@contextmanager
def cd(newdir):
    prevdir = os.getcwd()
    os.chdir(os.path.expanduser(newdir))
    try:
        yield
    finally:
        os.chdir(prevdir)

# thx to sol to https://stackoverflow.com/questions/27642656/
def line_size_hint(filename, learn_size=1 << 13):
    with open(filename, 'rb') as file:
        buf = file.read(learn_size)
        return len(buf) // buf.count(b'\n')

def get_num_of_lines_approx(filename):
    num_of_lines_approx = None
    try:
        num_of_lines_approx = os.path.getsize(filename) // line_size_hint(filename)
    except Exception as e:
        logger.exception(e)
    return num_of_lines_approx

def clean_dirs(to_clean_dirs):
    cleaned_dirs = []
    for x in to_clean_dirs:
        if x[-1] == ':':
            x = x[:-1]
        cleaned_dirs += [x]
    return cleaned_dirs

def clean_project(project_name):
  info = project_info(project_name)
  project_dir = os.path.join(CORPUS_DIR, project_name, info['build-dir'])
  if not os.path.exists(project_dir):
    return
  with cd(project_dir):
    clean_command = info['clean'].strip().split()
    run_cmd(clean_command)
    run_cmd(['rm', '-r', DLJC_OUTPUT_DIR])
    if 'git-url' in info:
      run_cmd(['git', 'reset', '--hard', 'HEAD'])
      run_cmd(['git', 'clean', '-dxf', '.'])

def get_class_dirs(project_name, clean_path=False):
    classdirs = []
    dljc_output = os.path.join(
        get_corpus_project_dir(project_name), DLJC_OUTPUT_DIR, "javac.json"
    )
    if not os.path.exists(dljc_output):
        logger.warning("Did not find the DLJC OUTPUT DIR. Return None instead.")
        return None
    with open(dljc_output, "r") as f:
        javac_commands = json.loads(f.read())
        for command in javac_commands:
            classdir = command["javac_switches"].get("d")
            if classdir:
                classdirs.append(classdir)
    if clean_path:
        classdirs = clean_dirs(classdirs)
    return classdirs

def get_source_files(project_name):
    srcfiles = []
    project_dir_in_corpus = get_corpus_project_dir(project_name)
    dljc_output = os.path.join(project_dir_in_corpus, DLJC_OUTPUT_DIR, "javac.json")
    if not os.path.exists(dljc_output):
        return srcfiles
    with open(dljc_output, "r") as f:
        javac_commands = json.loads(f.read())
        for command in javac_commands:
            if "java_files" in command:
                srcfiles.extend(command["java_files"])
    return srcfiles

def source_path(javac_command):
    if "javac_switches" in javac_command:
        switches = javac_command["javac_switches"]
        if "sourcepath" in switches and "build" not in switches["sourcepath"]:
            return switches["sourcepath"]
        if "java_files" in javac_command:
            common_prefix = os.path.commonprefix(javac_command["java_files"])
            # extracting longest common directory
            return os.path.dirname(common_prefix)
    logger.warning("Did not find source directories. Return None instead.")
    return None

def get_source_dirs(project_name, clean_path=False):
    srcdirs = []
    project_dir_in_corpus = get_corpus_project_dir(project_name)
    dljc_output = os.path.join(project_dir_in_corpus, DLJC_OUTPUT_DIR, "javac.json")
    # let's assume the project's main directory
    # is the source directory if the DLJC_OUTPUT_DIR is non existent.
    if not os.path.exists(dljc_output):
        logger.warning("Did not find the DLJC output dir.")
        logger.warning("Using %s instead.", project_dir_in_corpus)
        # TODO(has) find a way to detect if the project has a src directory.
        return [project_dir_in_corpus]
    with open(dljc_output, "r") as f:
        javac_commands = json.loads(f.read())
        for command in javac_commands:
            srcdir = source_path(command)
            if srcdir:
                srcdirs.append(srcdir)
    if clean_path:
        srcdirs = clean_dirs(srcdirs)
    return srcdirs

def load_corpus_info(corpus_file="corpus.json"):
    corpus_path = os.path.join(DATA_DIR, corpus_file)
    assert os.path.exists(corpus_path)
    with open(corpus_file) as f:
        info = json.loads(f.read())
        global_properties = info.get("global", {})
        projects = info["projects"]
        for project_name in projects.keys():
            base = copy.deepcopy(global_properties)
            base["name"] = project_name
            base.update(projects[project_name])
            projects[project_name] = base
        return info

def get_corpus_info():
    # CORPUS_INFO is dependent of your project;
    # meaning you have to set it; otherwise
    # this code assumes your corpus.json is under
    # the current working directory.
    global CORPUS_INFO
    if not CORPUS_INFO:
        CORPUS_INFO = load_corpus_info()
    return CORPUS_INFO

# @keep
def set_corpus_file(newfile):
    global CORPUS_INFO
    if not CORPUS_INFO:
        CORPUS_INFO = load_corpus_info(corpus_file=newfile)
    return CORPUS_INFO

# @keep
def set_output_dir(newdir, dontexist=False):
    global OUTPUT_DIR
    if os.path.isdir(newdir) or dontexist:
        # os.path.isdir will return false if dir does not exist.
        # however, run.py sets the output dir even if it does
        # exist. therefore, we need to tell this function to set
        # the output dir even if it does not exist.
        OUTPUT_DIR = newdir
    return OUTPUT_DIR

# @keep
def set_corpus_dir(newdir, dontexist=False):
    global CORPUS_DIR
    if os.path.isdir(newdir) or dontexist:
        logger.info("Successfully changed %s to %s", CORPUS_DIR, newdir)
        CORPUS_DIR = newdir
    return CORPUS_DIR

# Installs deps
# @keep
def install_deps(repos):
  stats = {"return_code": 0, "elapsed": 0}
  
  if os.path.isdir(DREQS) and not repos.force:
    return True, stats
  
  watch = utils.Stopwatch(stdout=print, debug=repos.debug)
  # downloads dependencies:
  # 1. Downloads do-like-javac, its preprocessing tools, and
  # the set of software repositories to be analyzed
  installer_dljc = ["./deps.sh"]
  stats = run_cmd(installer_dljc, stdout=print, verbose=repos.debug)
  stats["elapsed"] = watch.elapsed()
  return stats["return_code"] == 0, stats

# @keep
def get_corpus_set(setname):
    corpus = get_corpus_info()
    if setname == "all":
        return corpus["projects"].keys()
    return corpus["sets"][setname]

def get_method_map(list_of_methods):
    dot_to_method_map = {}
    for project, methods in list_of_methods:
        # find the right dot file for each method
        for method_name, method_dot_file in methods:
            if not os.path.isfile(method_dot_file):
                logger.error(
                    "Cannot find method file for project %s at %s",
                    project,
                    method_dot_file,
                )
                sys.exit(0)
            dot_to_method_map[method_dot_file] = method_name
    return dot_to_method_map

def project_info(project_name):
    return get_corpus_info()["projects"].get(project_name, None)

def get_corpus_project_dir(project_name, info=None):
    project = project_info(project_name) if info is None else info
    if "build-dir" in project:
        return os.path.join(CORPUS_DIR, project["name"], project["build-dir"])
    return os.path.join(CORPUS_DIR, project["name"])

def get_project_dir(project_name):
    return os.path.join(OUTPUT_DIR, project_name)

def get_kernel_path(project_name):
    return os.path.join(get_project_dir(project_name), "kernels.txt")

def get_results_path(project_name):
    return os.path.join(OUTPUT_DIR, (project_name + "_results.txt"))

def get_json_results_path(project_name):
    return os.path.join(OUTPUT_DIR, (project_name + "_results.json"))

def get_dot_path(project_name, dot_name):
    return os.path.join(get_project_dir(project_name), dot_name)

def get_corpus_kernel_path(corpus_kernel_file):
    return os.path.join(OUTPUT_DIR, corpus_kernel_file)

def get_corpus_kernel_file(corpus_kernel_file):
    return os.path.join(OUTPUT_DIR, corpus_kernel_file)

def get_method_from_dot_file(method_out):
    method = re.findall(r'"([^"]*)"', method_out)
    return method[0] if method else None

def get_project_list():
    return [
        project
        for project in os.listdir(OUTPUT_DIR)
        if os.path.isdir(get_project_dir(project))
    ]

def move(src, dst):
    if os.path.exists(src):
        shutil.move(src, dst)

def copytree(src, dst):
    if os.path.exists(src):
        shutil.copytree(src, dst)

def mkdir(newdir):
    if not os.path.isdir(newdir):
        os.makedirs(newdir)

def rmdir(dir_path):
    try:
        if os.path.isdir(dir_path):
            shutil.rmtree(dir_path)
    except OSError as e:
        print("Error: %s : %s" % (dir_path, e.strerror))

def rotate_dir(d, retain_src=False):
    i = 1
    dirformat = "{}.{}"
    while os.path.exists(dirformat.format(d, i)):
        i += 1
    rd = dirformat.format(d, i)
    move(d, rd)
    if retain_src:
        copytree(rd, d)

def rotate_file(f):
    i = 1
    fileformat = "{}_{}"
    (filename, ext) = os.path.splitext(f)
    while os.path.exists(fileformat.format(filename, i) + ext):
        i += 1
    newfile = fileformat.format(filename, i) + ext
    move(f, newfile)

def run_cmd(cmd, stdout=None, timeout=None, verbose=True):
    stats = {"timed_out": False, "output": ""}
    timer = None
    if isinstance(cmd, str):
        friendly_cmd = cmd
        cmd = cmd.split()
    else:
        friendly_cmd = " ".join(cmd)
    if stdout is None or isinstance(stdout, str):
        stdout = logging.debug
    def kill_proc(proc, stats):
        stdout("Timed out after {}s on {}".format(timeout, friendly_cmd))
        stats["timed_out"] = True
        proc.kill()
    print("Running {}".format(friendly_cmd))
    stdout("Running {}".format(friendly_cmd))
    watch = utils.Stopwatch(stdout=stdout, debug=verbose)
    try:
        process = subprocess.Popen(
            cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT
        )
        if timeout:
            timer = Timer(timeout, kill_proc, [process, stats])
            timer.start()
        for line in iter(process.stdout.readline, b""):
            line = line.decode("utf-8")
            stats["output"] = stats["output"] + line
            stdout(line)
        process.stdout.close()
        process.wait()
        stats["return_code"] = process.returncode
        if timer:
            timer.cancel()
        watch.reset_and_log("Executed {}".format(friendly_cmd))
    except (TypeError, ValueError, subprocess.SubprocessError):
        stdout(f"Call to {friendly_cmd} failed. See:\n{traceback.format_exc()}")
    return stats

def find_method(project, dotfile):
    with open(dotfile, "r") as df:
        all_lines = df.readlines() or []
        each_line = all_lines[0] if all_lines and len(all_lines) > 0 else None
        method_name = get_method_from_dot_file(each_line)
        jm = Method()
        jm.project = project
        jm.methodname = method_name
        jm.dotfile = dotfile
        return jm
    return None

def index_project(project, project_dir=None):
    repo_dir = get_project_dir(project) if project_dir is None else project_dir
    methods = set()
    for r, _ds, fs in os.walk(repo_dir):
        for f in fnmatch.filter(fs, "*.dot"):
            dot_file = os.path.join(r, f)
            jm = find_method(project, dot_file)
            if jm is None:
                logger.debug("could find method for '%s'", dot_file)
                continue
            methods.add(jm)
    return [(project, methods)]

def index_project_dotfiles(project, dotfiles):
    methods = set()
    for dotfile in tqdm(dotfiles, desc="dotfile-index"):
        jm = find_method(project, dotfile)
        if jm is None:
            logger.debug("could find method for '%s'", dotfile)
            continue
        methods |= {jm}
    return [(project, methods)]

def create_index_project_methods():
    list_of_methods = []
    for project in get_project_list():
        list_of_methods += index_project(project)
    return list_of_methods
DYNTRACE_ADDONS_DIR = os.path.join(WORKING_DIR, "dyntrace")
def copy_dyntrace_files(project_name):
  project_dir = get_project_dir(project_name)
  out_dir = os.path.join(project_dir, DLJC_OUTPUT_DIR)
  mkdir(out_dir)
  addons = [f for f in os.listdir(DYNTRACE_ADDONS_DIR) \
            if f.startswith(project_info(project_name)['name']+".")]
  for addon in addons:
    addon_type = addon.split('.', 1)[-1]
    shutil.copyfile(os.path.join(DYNTRACE_ADDONS_DIR, addon),
                    os.path.join(out_dir, addon_type))

def run_dljc2(project_name, tools=[], options=[]):
  project = project_info(project_name)
  timelimit = project.get('timelimit') or 900
  extra_opts = project.get('dljc-opt')
  exclusions = project['exclude']
  skipped_tools = [tool for tool in exclusions if tool in tools]
  remaining_tools = [tool for tool in tools if tool not in exclusions]
  # If tools is non-empty but remaining_tools is empty, then we don't need to do anything
  if tools and not remaining_tools:
    print("Skipping {} on {}".format(', '.join(skipped_tools), project_name))
    return
  elif tools:
    if skipped_tools:
      print("Running {} on {} (skipping {})".format(
            ', '.join(remaining_tools),
            project_name,
            ', '.join(skipped_tools)))
    else:
      print("Running {} on {}".format(
        ', '.join(remaining_tools),
        project_name))
#   copy_dyntrace_files(project_name)
#   if not os.environ.get('DAIKONDIR'):
#     os.environ['DAIKONDIR'] = os.path.join(TOOLS_DIR, 'daikon-src')
  project_dir = get_project_dir(project_name)
  with cd(project_dir):
    build_command = project['build'].strip().split()
    dljc_command = [DLJC_BINARY,
                    '-l', LIBS_DIR,
                    '-o', DLJC_OUTPUT_DIR,
                    '--timeout', str(timelimit)]
    if remaining_tools:
      dljc_command.extend(['-t', ','.join(remaining_tools)])
    dljc_command.extend(options)
    if extra_opts:
      dljc_command.extend(extra_opts.split())
    dljc_command.append('--')
    dljc_command.extend(build_command)
    result = run_cmd(dljc_command, 'dljc')
    if result['return_code'] != 0:
      print("DLJC command failed on {}".format(project_name))
      print(result)
      sys.exit(1)

def run_dljc(project_name, tools=None, options=None, overrides=None):
    dljc_result = {"return_code": 1}
    def get_or_else(proj, key, val):
        if proj is None:
            return val
        return proj.get(key, val)
    project = project_info(project_name)
    timelimit = get_or_else(project, "timelimit", 900)
    extra_opts = get_or_else(project, "dljc-opt", None)
    exclusions = get_or_else(project, "exclude", [])
    tools = tools or []
    options = options or []
    skipped_tools = [tool for tool in exclusions if tool in tools]
    remaining_tools = [tool for tool in tools if tool not in exclusions]
    # If tools is non-empty but remaining_tools is empty, then we don't
    # need to do anything
    if tools and not remaining_tools:
        logger.info("Skipping %s on %s", ", ".join(skipped_tools), project_name)
        return dljc_result
    
    if tools:
        if skipped_tools:
            logger.info(
                "Running %s on %s (skipping %s)",
                ", ".join(remaining_tools),
                project_name,
                ", ".join(skipped_tools),
            )
        else:
            logger.info("Running %s on %s", ", ".join(remaining_tools), project_name)
    # added to handle non .git repositories
    project_dir = get_corpus_project_dir(
        project_name) if project else get_or_else(overrides, "project_dir", None)
    
    if not project_dir:
        logger.warning("Project directory cannot be found")
        return dljc_result
    
    dljc_output = os.path.join(
        get_corpus_project_dir(project_name), DLJC_OUTPUT_DIR
    )
    os.environ['DAIKONDIR'] = os.path.join(LIBS_DIR, 'daikon-src')
    logger.info("Found %s project dir", project_dir)
    with cd(project_dir):
        # for non .git repositories, the project variable
        # may be None. Consequently, no build is necessary.
        build_command = project["build"].strip().split() if project else ["mvn", "-v"]
        dljc_command = [DLJC_BINARY]
        if project:
            dljc_command.extend(["-o", dljc_output, '-l', LIBS_DIR, "--timeout", str(timelimit)])
            # dljc_command.extend(["-o", DLJC_OUTPUT_DIR, "--timeout", str(timelimit)])
        else:
            dljc_command.extend(["--timeout", str(timelimit)])
        if remaining_tools:
            dljc_command.extend(["-t", ",".join(remaining_tools)])
        dljc_command.extend(options)
        if extra_opts:
            dljc_command.extend(extra_opts.split())
        dljc_command.append("--")
        dljc_command.extend(build_command)
        dljc_result = run_cmd(dljc_command, "dljc")
    if dljc_result["return_code"] != 0:
        logger.error("DLJC command failed on %s", project_name)
    return dljc_result

def generate_graphs(project: Project, graph_choice: Graph) -> dict:
    """Run dljc: Generate program graphs using prog2dfg or augmaker.jar.
    """
    dljc_result = {"return_code": 1}
    if graph_choice is Graph.P2D:
        # This graph representation won't work on incomplete code
        # snippets as prog2dfg needs a compiled version (.class)
        # of them. Use Graph.AUG instead.
        dljc_result = run_dljc(
            project.name,
            ["graphtool"],
            ["--graph-jar", get_jar("prog2dfg.jar"), "--cache"],
        )
    elif graph_choice in Graph.AUG:
        tool_options = ["--graph-jar", get_jar("augmaker.jar"),
                        "--out", project.outdir,
                        "--batch-size", str(project.howmany),
                        "--project-file", project.projects_csv,
                        "--cache"]
        dljc_result = run_dljc(
            project.name,
            ["graphtool"],
            tool_options,
            {"project_dir": project.outdir}  # overrides
        )
    else:
        raise ValueError(f"Unknown graph representation: {graph_choice}")
    return dljc_result

if __name__ == "__main__":
  pass
