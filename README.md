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
› git checkout randoop
```

Then build the `arcosdescertsri/descert-example-randoop-amzncorretto` Docker image

```sh
› docker build -t arcosdescertsri/descert-example-randoop-amzncorretto -f docker/Dockerfile .
```

Building this image will triger the `runRandoop` gradle task. This task will generate regressions for the `descert-example` project and will generate a `randoop-log.txt` file. This file contains information about the tests that were generated and this information
would different on each run of the `runRandoop` task.

For your convenience, we have placed a copy of the `randoop-log.txt` in the `randoop-log-out` directory, which is part of this repository.


1.b Pull Docker image

```sh
› docker pull arcosdescertsri/descert-example-randoop-amzncorretto:latest
```


2. Run it

```sh
› docker run --rm -it arcosdescertsri/descert-example-randoop-amzncorretto /bin/bash
```

If you want to see the `runRandoop` task in action, you can execute the following commands on your terminal:

```sh
# ./gradlew clean; ./gradlew build; ./gradlew runRandoop
```


3. Results

1. Regression tests:  `/usr/local/src/descert-example/src/test/java/com/foo/RegressionTest0.java` and `/usr/local/src/descert-example/src/test/java/com/foo/RegressionTestDriver.java`
2. Log file: `/usr/local/src/descert-example/randoop-log.txt`


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



