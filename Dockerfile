FROM eclipse-temurin:17-jdk-alpine

WORKDIR /emp

COPY target/emp.jar emp.jar

EXPOSE 8080 

ENTRYPOINT ["java", "-jar", "emp.jar"]