# DesCert example

[![License](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)


If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

The goal of this project is to show how to generate evidence (in this case, Randoop results) as part of this project's build process.

Currently, this project applies only the `randoop-gradle-plugin`. Eventually, it will apply other plugins such as `daikon-gradle-plugin`, and `sally-gradle-plugin`, etc.

## Creating a Docker image for this project

In this project example, we are using the `amazoncorretto:8-alpine-full` Docker image as our base Docker image.

If the entire image is provided to you, then you can skip step 1 and go to step 1.b. Otherwise, skip step 1.b

### Steps

1. Build Docker image 

From your terminal, clone the `descert-example` project:

```sh
› git clone http://github.com/SRI-CSL/descert-example.git
› cd descert-example
```

Then build the `vesperin/descert-example` Docker image

```sh
› docker build -t vesperin/descert-example -f docker/Dockerfile .
```

Building this image will triger the `runRandoop` gradle task. This task will generate regressions for the `descert-example` project and will generate a `randoop-log.txt` file. This file contains information about the tests that were generated and this information
would different on each run of the `runRandoop` task.

For your convenience, we have placed a copy of the `randoop-log.txt` in the `randoop-log-out` directory, which is part of this repository.


1.b Pull Docker image

```sh
› docker pull vesperin/descert-example
```


2. Run it

```sh
› docker run --rm -it vesperin/descert-example /bin/bash
```

If you want to see the `runRandoop` task in action, you can execute the following commands on your terminal:

```sh
# ./gradlew clean; ./gradlew build; ./gradlew runRandoop
```


3. Results

1. Regression tests:  `/usr/local/src/descert-example/src/test/java/com/foo/RegressionTest0.java` and `/usr/local/src/descert-example/src/test/java/com/foo/RegressionTestDriver.java`
2. Log file: `/usr/local/src/descert-example/randoop-log.txt`


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

