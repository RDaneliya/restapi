FROM gradle:6.3.0-jdk11 AS builder
WORKDIR /source
COPY --chown=gradle:gradle build.gradle ./
COPY --chown=gradle:gradle settings.gradle ./
COPY --chown=gradle:gradle src ./src/
COPY --chown=gradle:gradle 