FROM openjdk:8-jre-alpine

WORKDIR /app

COPY build/libs/qotd-0.0.1-SNAPSHOT.jar /app/qotd.jar

EXPOSE 8080

CMD java -jar /app/qotd.jar