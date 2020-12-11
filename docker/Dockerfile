FROM amazoncorretto:8-alpine-full

# install basics
RUN apk update && apk upgrade && \
    apk add --no-cache bash git vim

# Daikon plugin has been published to gradle plugin portal
# so there is no need for the following two lines
# RUN cd ~ ; git clone https://github.com/SRI-CSL/daikon-gradle-plugin.git dgp
# RUN cd ~/dgp ; ./gradlew clean; ./gradlew build; ./gradlew publishToMavenLocal

RUN cd ~ ; git clone https://github.com/SRI-CSL/randoop-gradle-plugin.git rgp
RUN cd ~/rgp ; ./gradlew clean; ./gradlew build; ./gradlew publishToMavenLocal

RUN cd ~ ; git clone https://github.com/SRI-CSL/daikon-gradle-plugin.git dgp
RUN cd ~/dgp ; ./gradlew clean; ./gradlew build; ./gradlew publishToMavenLocal


COPY . /usr/local/src/descert-example
# Gets a new version of Daikon
RUN (cd /usr/local/src/descert-example/libs && ls -al daikon.jar && rm -f daikon.jar && wget https://homes.cs.washington.edu/~mernst/tmp159/daikon.jar && ls -al daikon.jar)
WORKDIR /usr/local/src/descert-example

RUN ./gradlew clean
RUN ./gradlew build

# This will produce a file called randoop-log.txt
# containing information about generated tests
RUN ./gradlew randoopEvidence

# clean up after yourself
RUN rm -rf /usr/local/src/descert-example/com

# Runs Daikon
# RUN ./gradlew runDaikon
# RUN ./gradlew daikonEvidence