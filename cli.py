#!/usr/bin/env python
# Copyright SRI International, 2019 - present.

import os

import click

import common


class Repos:
    def __init__(self, homedir=None, debug=False, timeout=None, force=False):
        self.homedir = os.path.abspath(homedir or "srcdir")
        self.debug = debug
        self.timeout = timeout or -1
        self.force = force

    def exists(self):
        os.path.exists(self.homedir)

    def mkdir(self):
        common.mkdir(self.homedir)

    def subdir(self, that):
        if that is None:
            return None

        newdir = os.path.join(self.homedir, that)
        common.mkdir(newdir)
        return newdir


# Click's context; that is, the Repos object
pass_repos = click.make_pass_decorator(Repos)


@click.group()
@click.option(
    "--homedir",
    envvar="HOMEDIR",
    type=click.Path(),
    default=common.CORPUS_DIR,
    help="Dataset directory",
)
@click.option("--debug/--no-debug",
              envvar="DEBUG",
              default=False,
              help="Enables debugging mode")
@click.option("--timeout",
              envvar="TIMEOUT",
              default=-1,
              type=int,
              help="Task timeout (in secs).")
@click.option(
    "--force/--no-force",
    envvar="FORCE",
    default=False,
    help="Forces re-execution of tasks",
)
@click.pass_context
def cli(ctx, homedir, debug, timeout, force):
    if debug:
        click.echo("Debug mode is %s" % ("on" if debug else "off"))
    ctx.obj = Repos(homedir=homedir, debug=debug, timeout=timeout, force=force)
    ctx.obj.mkdir()


if __name__ == "__main__":
    pass
