FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-service.jar
ENTRYPOINT ["java","-jar","/demo-service.jar"]
EXPOSE 9002