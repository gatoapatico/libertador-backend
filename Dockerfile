FROM eclipse-temurin:17-alpine
COPY target/libertador-backend-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]