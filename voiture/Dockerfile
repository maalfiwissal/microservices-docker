FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} voiture-0.0.1-SNAPSHOT.jar

EXPOSE 8084

ENTRYPOINT ["java","-jar","/voiture-0.0.1-SNAPSHOT.jar"]