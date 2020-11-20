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


COPY . /usr/local/src/descert-example
WORKDIR /usr/local/src/descert-example

RUN ./gradlew clean
RUN ./gradlew build
RUN ./gradlew runRandoop -Prebuild
# RUN ./gradlew runDaikon