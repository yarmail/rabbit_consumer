# Сборка проекта в jar
FROM maven:3.8-openjdk-17 as maven
WORKDIR /app
COPY . /app
RUN mvn install

# Настройка порядка запуска контейнеров
# В ENTRYPOINT запускаем скрипт и добавляем ему параметров
# В в данном случае ожидаем пока запустится сервис rabbit_producer
FROM alpine:latest
RUN apk add --no-cache bash
copy wait-for.sh /wait-for.sh
RUN chmod +x /wait-for.sh

# Указание как запустить проект
FROM openjdk:17.0.2-jdk
WORKDIR /app
COPY --from=maven /app/target/rabbit_consumer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["/wait-for.sh", "rabbit_producer", "--timeout=20", "--", "java", "-jar", "app.jar"]