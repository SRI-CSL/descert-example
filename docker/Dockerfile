FROM amazoncorretto:8-alpine-full

# install basics
RUN apk update && apk upgrade && \
    apk add --no-cache bash git vim

COPY . /usr/local/src/descert-example
WORKDIR /usr/local/src/descert-example

## Daikon plugin has been published to gradle plugin portal so there is no need
## for the following unless you want a newer version than the published version.
## The ADD command is essential to avoid Gradle caching the "git clone" command.
# ARG owner=SRI-CSL
# ARG branch=master
ARG owner=mernst
ARG branch=debug
ADD https://api.github.com/repos/$owner/daikon-gradle-plugin/git/refs/heads/$branch version.json
RUN git clone --branch $branch https://github.com/$owner/daikon-gradle-plugin.git ~/dgp
RUN cd ~/dgp && ./gradlew clean && ./gradlew build && ./gradlew publishToMavenLocal

RUN ./gradlew clean
RUN ./gradlew build
# RUN ./gradlew runDaikon
