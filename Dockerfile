FROM gradle:8.8-jdk17 as builder

COPY . /app
WORKDIR /app
RUN gradle build --no-daemon -x test

FROM openjdk:17-jdk-slim
COPY --from=builder /app/build/libs/speakup-service-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar"]


