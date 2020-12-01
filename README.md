# DesCert example

[![License](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)


If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

The goal of this project is to show how to generate evidence (in this case, Randoop results) as part of this project's build process.

Currently, only the `randoop-gradle-plugin` plugin is applied to `descert-example`'s build process. Eventually, other Gradle plugins such as `daikon-gradle-plugin`, and `sally-gradle-plugin` will be also applied to `descert-example`'s build process.


## Pulling `vesperin/descert-example` Docker image from Docker Hub

This Docker image contains the `descert-example` repository and the results of a single execution of the Randoop plugin.


### Steps

#### 1 Pull `vesperin/descert-example` Docker image from _Docker Hub_

```sh
› docker pull vesperin/descert-example
```

#### 2. Start a new `bash` shell in a new `vesperin/descert-example` container

```sh
› docker run --rm -it vesperin/descert-example /bin/bash
```

At this point, you could either explore the results of a single execution of the Randoop plugin simply by examining the `randoop-log.txt` file,
or execute the `runRandoop` task from your terminal: 

```sh
# ./gradlew clean; ./gradlew build; ./gradlew runRandoop -Prebuild
```


## Results

The `runRandoop` task will execute the Randoop test generator on the `descert-example` repository.
This process will generate regression tests for two Java classes in this repository and a test driver for executing these tests.
It will also generate a `randoop-log.txt` file. This file contains information about the Java classes Randoop explored 
in order to generate these regression tests. This file also include information about the number unit tests that Randoop generated, and how long it took to generate them.

The generated files can be found at:

1. Regression tests: `/usr/local/src/descert-example/src/test/java/com/foo/`
2. `randoop-log.txt`: `/usr/local/src/descert-example/

Here is a summary of the Randoop's results

```sh
Randoop for Java version "4.2.3, local changes, branch master, commit 6fb16d1, 2020-03-31".
Will explore 2 classes
PUBLIC MEMBERS=6
Explorer = ForwardGenerator(steps: 0, null steps: 0, num_sequences_generated: 0;
    allSequences: 0, regresson seqs: 0, error seqs: 0=0=0, invalid seqs: 0, subsumed_sequences: 0, num_failed_output_test: 0;
    runtimePrimitivesSeen:38)

Progress update: steps=1, test inputs generated=0, failing inputs=0      (Fri Nov 20 22:44:40 GMT 2020     9MB used)
Progress update: steps=1000, test inputs generated=544, failing inputs=0      (Fri Nov 20 22:45:06 GMT 2020     621MB used)
Progress update: steps=1164, test inputs generated=633, failing inputs=0      (Fri Nov 20 22:45:10 GMT 2020     84MB used)
Normal method executions: 76753
Exceptional method executions: 1

Average method execution time (normal termination):      0.310
Average method execution time (exceptional termination): 0.282
Approximate memory usage 84MB
Explorer = ForwardGenerator(steps: 1164, null steps: 531, num_sequences_generated: 633;
    allSequences: 633, regresson seqs: 632, error seqs: 0=0=0, invalid seqs: 0, subsumed_sequences: 0, num_failed_output_test: 1;
    runtimePrimitivesSeen:38)

About to look for failing assertions in 328 regression sequences.

Regression test output:
Regression test count: 328
Writing regression JUnit tests...
Created file /usr/local/src/descert-example/src/test/java/com/foo/RegressionTest0.java
Created file /usr/local/src/descert-example/src/test/java/com/foo/RegressionTestDriver.java
Wrote regression JUnit tests.
About to look for flaky methods.

Invalid tests generated: 0
Successfully generated tests
```

## (Optional) Build your own Docker image

(This is step is not required for there is a `descert-example` Docker image on Docker Hub)

From your terminal, clone the `descert-example` project:

```sh
› git clone http://github.com/SRI-CSL/descert-example.git
› cd descert-example
```

Then, go ahead and build the `vesperin/descert-example` Docker image by executing the following command

```sh
› docker build -t vesperin/descert-example -f docker/Dockerfile .
```

This [docker/Dockerfile](docker/Dockerfile) contains all the commands a user could call on the command line to assemble the `vesperin/descert-example` image.
In more detail, using the commands specified in this Dockerfile, Docker will


1. Install all the necessary dependencies to build `descert-example`,
2. Clone the [randoop-gradle-plugin](https://github.com/SRI-CSL/randoop-gradle-plugin.git) repository,
3. Build the Randoop plug-in, as well as publish it to `Maven local`.

With the Randoop plug-in published on `Maven local`, Docker will

1. Build the `descert-example` repository,
2. Execute the `runRandoop` task, which will execute the Randoop test generator.

For your convenience, we have placed a copy of the `randoop-log.txt` in the `randoop-log-out` directory, which is part of this repository.


## License

    Copyright (C) 2020 SRI International

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

