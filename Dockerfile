FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 9000

ARG JAR_FILE=target/SchedulingService-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} SchedulingService.jar

ENTRYPOINT ["java", "-jar","/SchedulingService.jar"]
