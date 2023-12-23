FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY ${JAR_FILE} Client-0.0.1-SNAPSHOT.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "Client-0.0.1-SNAPSHOT.jar"]