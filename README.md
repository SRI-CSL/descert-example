# Baseline DesCert Example
## Using Daikon and Randoop Gradle Plugins

[![License](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

The goal of this repo is to show how to generate evidence with Baseline DesCert's Gradle plugins as part 
of this repos' own build process. Only Randoop and Daikon tasks are currently supported. These tasks
use Randoop 4.2.3 and Daikon 5.8.6.

## 1. Prereqs

### Docker
If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

**Important Note:** If you are not using Docker, and want to build this project on your own machine, then
you need Java 8+ in order to build this repo and use both the Randoop and Daikon tasks. In this README, we 
assume you are using Docker and the Docker image we are about to build for this repo. 

### GitHub repository

Clone the `descert-example` repo, if you have not done so:

```sh
› git clone http://github.com/SRI-CSL/descert-example.git
› cd descert-example
```

## 2. Configuration

### Plugins configuration

#### Add Gradle plugins to `build.gradle` file.

Open the `build.gradle` file and then add the following extension object:

```groovy
plugins {
    id 'java'
    id 'maven-publish'
	id 'com.sri.gradle.daikon' version '0.0.2-SNAPSHOT'
	id 'com.sri.gradle.randoop' version '0.0.1-SNAPSHOT'
}
```

The first two entries add tasks for building Java projects and tasks for publishing build artifacts to an 
Apache Maven repository. The last two entries add tasks for executing both Daikon and Randoop tools. 

#### Configure Randoop and Daikon plugins
 
Next, we configure the Randoop and Daikon plugins by adding the following extension objects:

```groovy
// Randoop plugin configuration
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

// Daikon plugin configuration
runDaikon {
    requires = file("libs")
    outputDir = file("${projectDir}/build/daikon-output")
    testDriverPackage = "com.foo"
}
```

#### Manage plugins discovery

Lastly, we update the `settings.gradle` to make sure this repo knows where to look
for the Randoop and Daikon plugins, or any other plugins you have specified in the `build.gradle` file:

```groovy
pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
```

If the plugins have not published to either Maven Central or Gradle plugin portal, you can still use a locally-built version of the Randoop and Daikon plugins. All you have to do is the following:

```sh
› git clone http://github.com/SRI-CSL/<tool>-gradle-plugin.git
› cd <randoop|daikon>-gradle-plugin
› ./gradlew build
› ./gradlew publishToMavenLocal
```

where `tool` is either `randoop` or `daikon`.

### Docker configuration

#### (Option 1) Build your own Docker image

We assume you have already cloned the `descert-example` repo and also have changed your
your working director to `descert-example`.

From your terminal, build the `vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` Docker image by executing the
following command:

```sh
in descert-example/
› docker build -t vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full -f docker/Dockerfile .
```

If everything went ok, then your new docker image would be listed on the available docker images list. 
From your terminal, execute the `docker images` command to show a few details of your new docker image:

```sh
› docker images
REPOSITORY                              				TAG             IMAGE ID	CREATED        SIZE
vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full   	latest          <ID>   	22 hours ago   1.13GB
amazoncorretto                          				8-alpine-full   <ID>   	5 days ago     201MB
```

The [docker/Dockerfile](docker/Dockerfile) you used in the previous command contains all the commands a user could run on the command line to assemble the `vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` image.
In more detail, using the commands specified in this Dockerfile, Docker will


1. Install all the necessary dependencies to build `descert-example`,
2. Clone the [randoop-gradle-plugin](https://github.com/SRI-CSL/randoop-gradle-plugin.git) repository,
3. Build the Randoop plug-in, as well as publish it to `Maven local`.
4. Clone the [daikon-gradle-plugin](https://github.com/SRI-CSL/daikon-gradle-plugin.git) repository,
5. Build the Daikon plug-in, as well as publish it to `Maven local`.

With the Randoop and Daikon plugins published to `Maven local`, Docker will

1. Build the `descert-example` repository,
2. Execute the `randoopEvidence`, `runDaikon`, and `daikonEvidence` tasks.

All evidence files will be generated after executing step 2.

#### (Option 2) Getting Docker image from Docker Hub

From your terminal, run the following command:

#### 1. Pull `vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` Docker image from _Docker Hub_

```sh
› docker pull vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full
```

## 3. Docker container

Start a new `bash` shell in a new `vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full` container

```sh
› docker run --rm -it vesperin/randoop-4-2-3-daikon-5-8-6-amzn-alpine-full /bin/bash
```

At this point, you could explore the results of a single execution of the Randoop and Daikon plugins by
looking at any of the following files:

### Randoop evidence

- `randoop-summary.txt`
- `randoop-evidence.json`
-  `RandoopTestsAndMetrics.csv`
-  `RandoopJUnitTestGeneration.csv`
-  `RandoopToolQualification.csv`


### Daikon Evidence

-  `daikon-evidence.json`
-  `DaikonInvsAndMetrics.csv`
-  `DaikonPluginConfig.csv`
-  `DaikonPluginQualification.csv`


### Evidence (files) Examples

For example, here is the content of `randoop-evidence.json` and `daikon-evidence.json` files:

```json
{
  "Evidence": {
    "RandoopJUnitTestGeneration": {
      "INVOKEDBY": "RandoopGradlePlugin",
      "AUTOMATEDBY": "RandoopGradlePlugin",
      "PARAMETERS": "[--time-limit:30, --flaky-test-behavior:output, --output-limit:2000, --usethread:true, --no-error-revealing-tests:true, --stop-on-error-test:false, --junit-reflection-allowed:false, --junit-package-name:com.foo, --junit-output-dir:src/test/java]"
    },
    "RandoopToolQualification": {
      "RANDOOP_VERSION": "4.2.3",
      "DATE": "2020-03-31",
      "SUMMARY": "Runs the Randoop Tool",
      "QUALIFIEDBY": "SRI International",
      "INSTALLATION": "https://github.com/SRI-CSL/randoop-gradle-plugin/blob/master/README.md",
      "USERGUIDE": "https://github.com/SRI-CSL/randoop-gradle-plugin/blob/master/README.md",
      "RANDOOP_PLUGIN_VERSION": "0.1",
      "TITLE": "RandoopGradlePlugin",
      "ACTIVITY": "TestGeneration"
    },
    "RandoopTestsAndMetrics": {
      "BRANCH": "master",
      "EXPLORED_CLASSES": "2",
      "COMMIT": "6fb16d1",
      "PUBLIC_MEMBERS": "6",
      "NORMAL_EXECUTIONS": "314804",
      "REGRESSION_TEST_COUNT": "885",
      "ERROR_REVEALING_TEST_COUNT": "0",
      "AVG_EXCEPTIONAL_TERMINATION_TIME": "0.224",
      "MEMORY_USAGE": "4647MB",
      "EXCEPTIONAL_EXECUTIONS": "0",
      "GENERATED_TEST_FILES_COUNT": "3",
      "AVG_NORMAL_TERMINATION_TIME": "0.0572",
      "GENERATED_TEST_FILES": [
        "src/test/java/com/foo/RegressionTest0.java",
        "src/test/java/com/foo/RegressionTest1.java",
        "src/test/java/com/foo/RegressionTestDriver.java"
      ],
      "CHANGES": "local",
      "INVALID_TESTS_GENERATED": "0",
      "NUMBEROFTESTCASES": "885"
    }
  }
}
```

```json
{
  "Evidence": {
    "DaikonPluginConfig": {
      "OUTPUT_DIR": "build/daikon-output",
      "TEST_DRIVER_PACKAGE": "com.foo"
    },
    "DaikonPluginQualification": {
      "DATE": "2021-3-30",
      "SUMMARY": "Runs the Daikon Tool",
      "QUALIFIEDBY": "SRI International",
      "INSTALLATION": "https://github.com/SRI-CSL/daikon-gradle-plugin/blob/master/README.md",
      "USERGUIDE": "https://github.com/SRI-CSL/daikon-gradle-plugin/blob/master/README.md",
      "TITLE": "DaikonGradlePlugin",
      "ACTIVITY": "Dynamic Analysis"
    },
    "DaikonInvsAndMetrics": {
      "CORES": "16",
      "JVM_MEMORY_LIMIT_IN_BYTES": "477626368",
      "SUPPORT_FILES": [
        "build/daikon-output/RegressionTestDriver.dtrace.gz",
        "build/daikon-output/RegressionTestDriver.decls-DynComp",
        "build/daikon-output/RegressionTestDriver.inv.gz"
      ],
      "PP_COUNT": "5",
      "INVARIANTS_FILE": "build/daikon-output/RegressionTestDriver.inv.txt",
      "MEMORY_AVAILABLE_TO_JVM_IN_BYTES": "432013312",
      "CLASSES_COUNT": "1",
      "TEST_DRIVER": "src/test/java/com/foo/RegressionTestDriver.java",
      "TESTS_COUNT": "4",
      "INVARIANT_COUNT": "0"
    }
  }
}
```


## Task description

### Randoop tasks

Currently, we support the following Gradle tasks on the Randoop Gradle Plugin:

`randoopEvidence` - Produces an evidence artifact containing the specific details of the Randoop execution.
`generateTests` - Generates tests for a given project using Randoop (Main task).
`generateClassListFile` - Generates a file that lists classes that Randoop will explore to generate tests.
`cleanupRandoopOutput` - Deletes all Randoop-generated tests.
`checkForRandoop` - Checks if Randoop is in CLASSPATH.

The ordering of the above tasks is intented to show some dependencies between tasks. 
For example, in order to perform the `generateClassListFile`, you must perform `cleanupRandoopOutput`
and `checkForRandoop` first (in that order).

You can run any of the above Gradle tasks using the `gradlew` command. For example, to generate unit tests for this repo, execute the `generateTests` task from your terminal:

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

