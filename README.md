# DesCert example

[![License](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)


If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

The goal of this repo is to show how to generate evidence with Baseline DesCert's Gradle plugins as part 
of this repos' own build process. Only Randoop and Daikon tasks are currently supported. These tasks
use Randoop 4.2.3 and Daikon 5.8.6.

**Important Note:** If you are not using Docker, and want to build this project on your own machine, then
you need Java 8+ in order to build this repo and use both the Randoop and Daikon tasks. In this README, we 
assume you are using Docker and the Docker image we are about to build for this repo. 

## Configuration

### Add Gradle plugins

We start by adding the following plugins to this repo's `build.gradle` file:

```groovy
plugins {
    id 'java'
    id 'maven-publish'
	id 'com.sri.gradle.daikon' version '0.0.2-SNAPSHOT'
	id 'com.sri.gradle.randoop' version '0.0.1-SNAPSHOT'
}
```

The first two entries add tasks for building Java projects and tasks for publishing build artifacts to an 
Apache Maven repository. The last two entries add tasks for executing both Randoop and Daikon tools. 

### Configure Randoop and Daikon plugins
 
Next, we configure the Randoop and Daikon plugins:

```groovy
runRandoop {
    randoopJar = file("libs/randoop.jar")
    junitOutputDir = file("${projectDir}/src/test/java")
    timeoutSeconds = 30
    stopOnErrorTest = false
    flakyTestBehavior = 'output'
    noErrorRevealingTests = true
    junitReflectionAllowed = false
    usethreads = true
    outputLimit = 2000
    junitPackageName = 'com.foo'
}

// Uncomment this when running descert-example in a docker container.
runDaikon {
    requires = file("libs")
    outputDir = file("${projectDir}/build/daikon-output")
    testDriverPackage = "com.foo"
}
```

### Manage plugins

Lastly, we update the `settings.gradle` to make sure this repo knows where to look
for the Randoop and Daikon plugins, or any other plugins:

```groovy
pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
```

**Note:** If the plugin is not in either Maven Central or Gradle plugin portal, you can use a locally-built version of the Randoop and Daikon plugins. All you have to do is the following:

```sh
› git clone http://github.com/SRI-CSL/<randoop|daikon>-gradle-plugin.git
› cd <randoop|daikon>-gradle-plugin
› ./gradlew build
› ./gradlew publishToMavenLocal
```

## Randoop and Daikon Gradle tasks

### Randoop tasks

Currently, we support the following Randoop Gradle tasks:

`randoopEvidence` - Produces an evidence artifact containing the specific details of the Randoop execution.
`generateTests` - Generates tests for a given project using Randoop (Main task).
`generateClassListFile` - Generates a file that lists classes that Randoop will explore to generate tests.
`cleanupRandoopOutput` - Deletes all Randoop-generated tests.
`checkForRandoop` - Checks if Randoop is in CLASSPATH.

The ordering of the above tasks is intented to show some dependencies between tasks. 
For example, in order to perform the `generateClassListFile`, you must perform `cleanupRandoopOutput`
and `checkForRandoop` first (in that order).

You can run any of the above Gradle tasks using the `gradlew` command. For example, you can ask the Randoop
tool to generate unit tests for this repo by executing the `generateTests` task: 

```sh
› ./gradlew generateTests
```

### Daikon Gradle tasks

The Daikon plugin support the following tasks: 

- `daikonEvidence` - Produces an evidence artifact containing the specific details of the Daikon execution.
- `runDaikon` - Detection of likely program invariants using Daikon (Main task).
- `generateTestDriverCode` - Generates test driver code that Daikon can execute (Optional task).
- `daikonCheck` - Checks if Daikon is in your project's classpath.

**Test driver trigger*

-   `-Pdriver` - Tells the plugin to invoke `generateTestDriverCode` task. When finished, it places the generated test driver at `build/driver` directory.

If `-Pdriver` is not provided, then the plugin assumes there is already test driver it can use with Daikon.
For example, the following commands will generate a test driver before invoking the `daikonEvidence` task:

```sh
› ./gradlew daikonEvidence -Pdriver
```

## Docker

### Build your own Docker image

We assume you have already cloned the `descert-example` repo and also have changed your
directory to `descert-example`. If you have not, go ahead and run the following commands on your
terminal:

```sh
› git clone http://github.com/SRI-CSL/descert-example.git
› cd descert-example
```

Then, assuming your working directory is now `descert-example`, go ahead and build the `descert/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` Docker image by executing the
following command

```sh
in descert-example/
› docker build -t descert/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full -f docker/Dockerfile .
```

From your terminal, run the `docker images` to see the just built image

```sh
› docker images
REPOSITORY                              				TAG             IMAGE ID	CREATED        SIZE
descert/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full   	latest          <ID>   	22 hours ago   1.13GB
amazoncorretto                          				8-alpine-full   <ID>   	5 days ago     201MB
```

This [docker/Dockerfile](docker/Dockerfile) contains all the commands a user could run on the command line to assemble the `descert/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` image.
In more detail, using the commands specified in this Dockerfile, Docker will


1. Install all the necessary dependencies to build `descert-example`,
2. Clone the [randoop-gradle-plugin](https://github.com/SRI-CSL/randoop-gradle-plugin.git) repository,
3. Build the Randoop plug-in, as well as publish it to `Maven local`.
4. Clone the [daikon-gradle-plugin](https://github.com/SRI-CSL/daikon-gradle-plugin.git) repository,
5. Build the Daikon plug-in, as well as publish it to `Maven local`.

With the Randoop and Daikon plugins published to `Maven local`, Docker will

1. Build the `descert-example` repository,
2. Execute the `randoopEvidence`, `runDaikon`, and `daikonEvidence` tasks.



### Create a Docker container from built Docker image

From your terminal, run the following commands:

```sh
in descert-example/
› docker run --rm -it descert/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full /bin/bash
bash-5.0#
```

If the  build of `descert-example` was a successful build, then the Randoop and Daikon evidence files
should be available and review. More specifically, the files `randoop-evidence.json`, 
`randoop-summary.txt`, and `daikon-evidence.json` should be available.

For example, here is the content of `randoop-evidence.json` and `daikon-evidence.json` files:

```json
{
  "DETAILS": {
    "REGRESSION_TEST_COUNT": "834",
    "INVALID_TESTS_GENERATED": "0",
    "RANDOOP_VERSION": "4.2.3",
    "EXPLORED_CLASSES": "2",
    "NORMAL_EXECUTIONS": "290613",
    "CHANGES": "local",
    "AGENT": "RANDOOP",
    "COMMIT": "6fb16d1",
    "AVG_NORMAL_TERMINATION_TIME": "0.0612",
    "PUBLIC_MEMBERS": "6",
    "AVG_EXCEPTIONAL_TERMINATION_TIME": "0.186",
    "GENERATED_TEST_FILES": [
      "src/test/java/com/foo/RegressionTest0.java",
      "src/test/java/com/foo/RegressionTest1.java",
      "src/test/java/com/foo/RegressionTestDriver.java"
    ],
    "BRANCH": "master",
    "ACTIVITY": "TEST_GENERATION",
    "GENERATED_TEST_FILES_COUNT": "3",
    "MEMORY_USAGE": "248MB",
    "DATE": "2020-03-31"
  }
}
```

```json
{
  "DETAILS": {
    "PP_COUNT": "5",
    "TEST_DRIVER": "src/test/java/com/foo/RegressionTestDriver.java",
    "DATE": "2021-3-4",
    "ACTIVITY": "DYNAMIC_ANALYSIS",
    "AGENT": "DAIKON",
    "MEMORY_AVAILABLE_TO_JVM_IN_BYTES": "354942976",
    "CLASSES_COUNT": "1",
    "JVM_MEMORY_LIMIT_IN_BYTES": "477626368",
    "INVARIANT_COUNT": "0",
    "SUPPORT_FILES": [
      "build/daikon-output/RegressionTestDriver.dtrace.gz",
      "build/daikon-output/RegressionTestDriver.decls-DynComp",
      "build/daikon-output/RegressionTestDriver.inv.gz"
    ],
    "TEST_DRIVER_PACKAGE": "com.foo",
    "TESTS_COUNT": "4",
    "CORES": "16",
    "INVARIANTS_FILE": "build/daikon-output/RegressionTestDriver.inv.txt"
  }
}
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

