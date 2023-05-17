FROM openjdk:17-alpine3.14
COPY target/*.jar /discovery.jar
ENTRYPOINT ["java","-jar","/discovery.jar"]