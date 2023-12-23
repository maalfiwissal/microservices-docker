FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} Gatway-0.0.1-SNAPSHOT.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/Gatway-0.0.1-SNAPSHOT.jar"]