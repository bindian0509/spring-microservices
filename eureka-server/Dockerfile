FROM maven:latest

MAINTAINER bindian0509@gmail.com

WORKDIR /app

COPY . .

RUN mvn clean install

ENTRYPOINT ["java", "-jar", "target/eureka-server-0.0.1-SNAPSHOT.jar"]