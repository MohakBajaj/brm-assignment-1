FROM openjdk:8-jdk-alpine

# copy the maven build
COPY /target/*.jar /app.jar

# run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]

