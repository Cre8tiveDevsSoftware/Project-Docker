FROM openjdk:17-jdk-alpine
LABEL maintainer="admin@teambootstrap.com"

VOLUME /main-app
ADD build/libs/EventPass-0.0.1-SNAPSHOT.jar /main-app/eventpass.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/main-app/eventpass.jar"]
