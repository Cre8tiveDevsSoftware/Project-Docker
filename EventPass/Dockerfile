
FROM gradle:jdk17 AS build

WORKDIR /app


COPY build.gradle settings.gradle /app/
COPY gradle /app/gradle


COPY src /app/src


RUN gradle clean build -x test
FROM openjdk:17-jdk-alpine
LABEL maintainer="admin@teambootstrap.com"
WORKDIR /app
COPY --from=build /app/build/libs/EventPass-0.0.1-SNAPSHOT.jar /app/eventpass.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/eventpass.jar"]