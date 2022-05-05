# DesCert with do-like-javac

Generate DesCert evidence data on software using [`do-like-javac`](https://github.com/SRI-CSL/do-like-javac), a tool for monitoring the build process of a Java project and recording information about what parameters were passed to javac for the purpose of later analysis. It can also automate the running of various analysis tools, including:

* [Randoop](https://randoop.github.io/randoop/)
* [Daikon](https://plse.cs.washington.edu/daikon/)
* [Checker Framework](http://types.cs.washington.edu/checker-framework/)

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

