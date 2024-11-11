FROM openjdk:21-jdk
WORKDIR /app
COPY app.class .
CMD ["java", "app"]
