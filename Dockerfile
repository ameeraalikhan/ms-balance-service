FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY target/ms-balance-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=9090"]