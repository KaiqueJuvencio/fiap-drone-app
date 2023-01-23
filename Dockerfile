FROM openjdk:19-jdk-alpine

COPY target/43scjDroneApp-0.0.1-SNAPSHOT.jar 43scjDroneApp.jar
ENTRYPOINT ["java","-jar","/43scjDroneApp.jar"]

EXPOSE 8060