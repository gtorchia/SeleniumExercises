FROM maven:3.6.1-jdk-8-alpine AS MAVEN_TOOL_CHAIN

WORKDIR /seleniumexercises

COPY . /seleniumexercises/

RUN ls -lRt driver

RUN chmod +x driver

RUN mvn  test
