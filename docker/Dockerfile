# FROM openjdk:8
FROM amazoncorretto:8-alpine-full

# install basics
RUN apk update && apk upgrade && \
    apk add --no-cache bash git vim
RUN cd ~ ; git clone https://github.com/SRI-CSL/daikon-gradle-plugin.git dgp
RUN cd ~/dgp ; ./gradlew clean; ./gradlew build; ./gradlew publishToMavenLocal


COPY . /usr/local/src/descert-example
WORKDIR /usr/local/src/descert-example

RUN ./gradlew clean
RUN ./gradlew build
RUN ./gradlew runDaikon

# RUN mkdir -p /opt/src
# WORKDIR /opt/src
# WORKDIR /usr/local/src/descert-example
# RUN ./gradlew daikonRun --stacktrace

# ENTRYPOINT ["./gradlew", "daikonRun"]