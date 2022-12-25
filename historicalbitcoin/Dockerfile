FROM openjdk:8-jdk-alpine
RUN addgroup -S dev && adduser -S dev -G dev
USER dev:dev
ARG JAR_FILE=target/*.jar
COPY historicalbitcoin-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]