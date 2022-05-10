# DesCert with do-like-javac

Generate DesCert evidence data on software using [`do-like-javac`](https://github.com/SRI-CSL/do-like-javac), a tool for monitoring the build process of a Java project and recording information about what parameters were passed to javac for the purpose of later analysis. It can also automate the running of various analysis tools, including:

* [Randoop](https://randoop.github.io/randoop/)
* [Daikon](https://plse.cs.washington.edu/daikon/)

`do-like-javac` supports projects built with:

* Apache Ant
* Apache Maven
* Gradle
* Manual invocation of `javac`

Dependencies
============

* Python 3
* The analysis tool(s) you want to run.
* Any build dependencies of the project you're analyzing.
* And those dependencies listed in the `requirements.txt`.


Usage
============

You can start dljc by cloning the `descert-example` repository using
the following command and then checking out the branch `decert-with-dljc`.

From your terminal,

```sh
› git clone https://github.com/SRI-CSL/descert-example.git
› cd descert-example
› git switch decert-with-dljc
```

Then, you install the required dependencies listed in
the `requirements.txt` file.

Once these dependencies are installed, run the following commands
from your terminal:

```sh
› python dnd-cli.py fetch-deps
› python dnd-cli.py fetch-repos --build --repo-set "log4j"  
```

The above commands will create `.dst` directory containing
three sub-directories: `data`, `tools`, and `libs`.

Under `data`, there is `corpus.json` file listing the GitHub repositories
we are interested in analyzing. In `tools`, you will have the `do-like-javac` tool. Lastly, under `libs`, you will have `randoop.jar`, `daikon.jar`,
and other dependencies required by these tools.

Once these dependencies and tools are installed, you can run the following
command to see what you can :

```sh
› python dnd-cli.py produce-evidence --tool randoop --tool csve --addon "--evidence-json"
```

The above command will execute Randoop, store its output in a JSON file. Then this JSON
will be transformed into a set of csv files using the csve tool.

To see what you can do with `dnd-cli.py`, please run the following command:

```sh
› python dnd-cli.py
Usage: dnd-cli.py [OPTIONS] COMMAND [ARGS]...

Options:
  --homedir PATH        Dataset directory
  --debug / --no-debug  Enables debugging mode
  --timeout INTEGER     Task timeout (in secs).
  --force / --no-force  Forces re-execution of tasks
  --help                Show this message and exit.

Commands:
  fetch-deps        Download needed dependencies
  fetch-repos       Download needed repositories
  produce-evidence  Generate DesCert evidence data
```

Or even see what you can do with specific commands, simply by 
using the `--help` option; e.g.,

```sh
› python dnd-cli.py produce-evidence --help
Usage: dnd-cli.py produce-evidence [OPTIONS]

  Generate DesCert evidence data

Options:
  --tool [randoop|chicory|csve|all]
                                  List of tools to execute
  --addon [--daikon-xml|--evidence-json|--error-driver|--override-evidence]
                                  Addons to forward to do-like-javac tools
  --help                          Show this message and exit.
```