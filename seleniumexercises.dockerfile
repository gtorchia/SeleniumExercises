FROM maven:3.6.1-jdk-8-alpine AS MAVEN_TOOL_CHAIN

WORKDIR /seleniumexercises

COPY . ./

RUN ls -lRt driver

RUN sleep 30

RUN mvn verify test
