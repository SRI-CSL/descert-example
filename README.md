# DesCert example

[![License](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)


If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

The goal of this project is to show how to generate evidence (in this case, Randoop and Daikon results) as part of this project's build process.

**Important Note:** If you are using Docker, then the produced Docker image will only support the Randoop Gradle plugin. If you are not, and want to build this project, then you will need Java 8+ in order to build this project and use the Randoop and Daikon tasks.

In this README, we assume you are using Docker and the Docker image of this project. This means, this project's `build.gradle` file contains the following entry:

```groovy
plugins {
    ...
	id 'com.sri.gradle.randoop' version '0.0.1-SNAPSHOT'
	// uncomment this entry if you are not using Docker
	// and want to build this project using your own environment.
	//id 'com.sri.gradle.daikon' version '0.0.2-SNAPSHOT'
}
```

This entry adds the Randoop plugin to `descert-example` build process. More specifically,
it adds the following tasks to the list of available Gradle tasks you can run with the `gradlew` command:

`checkForRandoop` - Checks if Randoop is in CLASSPATH.
`cleanupRandoopOutput` - Deletes all Randoop-generated tests.
`generateClassListFile` - Generates a file that lists classes that Randoop will explore to generate tests.
`generateTests` - Generates tests for a given project using Randoop (Main task).
`randoopEvidence` - Produces an evidence artifact containing the specific details of the Randoop execution.

The main task of this plugin is the `generateTests` Gradle task, which will generate unit tests for your project using Randoop.

Eventually, other Gradle plugins such as `daikon-gradle-plugin`, and `sally-gradle-plugin` will be also applied to `descert-example`'s build process. As seen above, the process for adding them to `descert-example` is as simple as adding a new entry to Gradle's `plugins{...}` object: e.g., `id 'com.sri.gradle.daikon' version '0.0.2-SNAPSHOT'`


**Note:** If the plugin is not in either Maven Central or Gradle plugin portal, you can use a locally-built version of the Randoop plugin. All you have to do is the following:

```sh
› git clone http://github.com/SRI-CSL/randoop-gradle-plugin.git
› cd randoop-gradle-plugin
› ./gradlew build
› ./gradlew publishToMavenLocal
```

Given that you are using Docker, you won't have to publish anything locally. The Docker image that you will be pulling (from Docker Hub) in a moment will do this for you. In other words, this Docker image packages up `descert-example` with all of the parts it needs in order to build it, such as libraries and other dependencies. Later in this document, we provide information about how to configure the Randoop plugin.


## Pulling `vesperin/descert-example` Docker image from Docker Hub

Let's continue by pulling the `vesperin/descert-example` Docker image from Docker Hub. This Docker image contains the `descert-example` repository, its dependencies, and the results of a single execution of the Randoop plugin. The next steps show you how to pull this Docker image from Docker Hub and run a container from it.


### Steps

#### 1. Pull `vesperin/descert-example` Docker image from _Docker Hub_

```sh
› docker pull vesperin/descert-example
```

#### 2. Start a new `bash` shell in a new `vesperin/descert-example` container

```sh
› docker run --rm -it vesperin/descert-example /bin/bash
```

At this point, you could either explore the results of a single execution of the Randoop plugin simply by examining the `/usr/local/src/descert-example/randoop-summary.txt` file, or execute the `randoopEvidence` Gradle task: 

```sh
# ./gradlew generateTests
```

The above task will generate a new `/usr/local/src/descert-example/randoop-summary.txt` file, or updating an existing one.  If you one to generate the evidence artifact (`/usr/local/src/descert-example/randoop-evidence.json`), then  you can run the following tasks:

```sh
# ./gradlew randoopEvidence
```

## Results

In summary, the `generateTests` generates both the unit tests and a test driver that execute those unit tests. It also generates a `/usr/local/src/descert-example/randoop-summary.txt` file containing a summary of a Randoop execution:

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
````

The file generated by the `randoopEvidence` task contains the following information:

```json
{
  "DETAILS": {
    "NORMAL_EXECUTIONS": "306808",
    "CHANGES": "local",
    "EXPLORED_CLASSES": "2",
    "AGENT": "RANDOOP",
    "BRANCH": "master",
    "AVG_NORMAL_TERMINATION_TIME": "0.0585",
    "REGRESSION_TEST_COUNT": "864",
    "INVALID_TESTS_GENERATED": "0",
    "AVG_EXCEPTIONAL_TERMINATION_TIME": "0.283",
    "ACTIVITY": "TEST_GENERATION",
    "MEMORY_USAGE": "690MB",
    "RANDOOP_VERSION": "4.2.3",
    "DATE": "2020-03-31",
    "PUBLIC_MEMBERS": "6",
    "COMMIT": "6fb16d1",
    "GENERATED_TEST_COUNT": "3"
  }
}
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
in descert-example/
› docker build -t vesperin/descert-example -f docker/Dockerfile .
```

This [docker/Dockerfile](docker/Dockerfile) contains all the commands a user could run on the command line to assemble the `vesperin/descert-example` image.
In more detail, using the commands specified in this Dockerfile, Docker will


1. Install all the necessary dependencies to build `descert-example`,
2. Clone the [randoop-gradle-plugin](https://github.com/SRI-CSL/randoop-gradle-plugin.git) repository,
3. Build the Randoop plug-in, as well as publish it to `Maven local`.
4. Clone the [daikon-gradle-plugin](https://github.com/SRI-CSL/daikon-gradle-plugin.git) repository,
5. Build the Daikon plug-in, as well as publish it to `Maven local`.

With the Randoop plug-in published on `Maven local`, Docker will

1. Build the `descert-example` repository,
2. Execute the `randoopEvidence` task, which will execute not only the Randoop test generator but also generate the evidence artifact.

For your convenience, we have placed a copy of the `randoop-summary.txt` and `randoop-evidence.json` files in the `randoop-log-out` directory, which is part of this repository.


## (Optional) Customizing `Randoop` plugin's behavior 

You can customize the plugin's behavior by updating any of its properties/settings in its `runRandoop` extension object in the project's `build.gradle` file:

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
```

On this extension object, you can change the following settings:

* `randoopJar`=_file_. The location where the plugin can find Randoop.
* `junitOutputDir`=_file_. Randoop output directory
* `timeoutSeconds`=_int_. Maximum number of seconds to spend generating tests. Zero means no limit. If nonzero, Randoop is nondeterministic: it may generate different test suites on different runs.
* `stopOnErrorTest`=_boolean_. Stop generation as soon as one error-revealing test has been generated. (default false)
* `flakyTestBehavior`=_enum_. What to do if Randoop generates a flaky test. A flaky test is one that behaves differently on different executions. Options include: (1) halt: Randoop halts with a diagnostic message; (2) discard: Discard the flaky test; (3) output: Output the flaky test, but with flaky assertions commented out.
* `noErrorRevealingTests`=_boolean_. Whether to output error-revealing tests.
* `junitReflectionAllowed`=_boolean_. Whether to use JUnit's standard reflective mechanisms for invoking tests.
* `usethreads`=_boolean_. If true, Randoop executes each test in a separate thread and kills tests that take too long to finish.
* `outputLimit`=_int_. The number of error-revealing and regression tests reaches the output limit.
* `junitPackageName`=_string_. Name of the package for the generated JUnit files. When the package is the same as the package of a class under test, then package visibility rules are used to determine whether to include the class or class members in a test.


## (Optional) Using the `Daikon` plugin

If you are not using the Docker image and are trying to use both Randoop and Daikon plugins, the the following information can give you an idea about how to do that.
Let's assume you have already cloned the `descert-example` repository and have published the Randoop and Daikon plugins to Maven local.
Information about how to do that is provided in previous sections.

From your terminal, run the following commands:

```sh
in descert-example/ on main
› ./gradlew generateTests; 
› ./gradlew runDaikon
› ./gradlew evidenceDaikon
```

First, besides generating unit tests and their test driver, the `generateTests` will compile them. The Daikon plugin will the compiled test classes (particularly the compiled test driver) and then will run Daikon.
Lastly, using the output of the `runDaikon` task, the `evidenceDaikon` will generate an evidence artifact; i.e., `daikon-evidence.json`.

Here is a snippet of the `*TestDriver.inv.txt` (one of the files generated by the `runDaikon` task):

```text
===========================================================================
com.foo.Foo:::OBJECT
===========================================================================
com.foo.Foo.Foo():::EXIT
===========================================================================
com.foo.Foo.mutate():::ENTER
===========================================================================
com.foo.Foo.mutate():::EXIT
===========================================================================
com.foo.FooManager:::OBJECT
===========================================================================
com.foo.FooManager.FooManager(com.foo.Foo):::ENTER
===========================================================================
com.foo.FooManager.FooManager(com.foo.Foo):::EXIT
===========================================================================
com.foo.FooManager.initialize():::ENTER
this.foo != null
===========================================================================
com.foo.FooManager.initialize():::EXIT
this.foo == orig(this.foo)
this.foo != null
===========================================================================
```

The following file is the evidence artifact generated by the `daikonEvidence` task:

```json
{
  "DETAILS": {
    "INVARIANT_COUNT": "3",
    "PP_COUNT": "871",
    "CORES": "16",
    "MEMORY_AVAILABLE_TO_JVM_IN_BYTES": "362283008",
    "AGENT": "DAIKON",
    "CLASSES_COUNT": "2",
    "DAIKON_OUT": "/Users/userid/dev/descert-example/build/daikon-output",
    "ACTIVITY": "DYNAMIC_ANALYSIS",
    "TESTS_COUNT": "869",
    "TEST_DRIVER_PKG": "com.foo",
    "JVM_MEMORY_LIMIT_IN_BYTES": "477626368"
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

