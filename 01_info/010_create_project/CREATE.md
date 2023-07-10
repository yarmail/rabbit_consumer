<a href="/README.md">вернуться к оглавлению</a>

<b>Создание проекта rabbit_consumer</b> <br><br>

File > New Project > Spring Initializr <br> 
Name - rabbit_producer <br>
Language - Java <br>
Type - Maven <br>
Project - SDK 17 <br>
Java - 17 <br>
Packaging - Jar <br><br>

Spring Boot 3.1.1 <br>

Dependencies: <br>
Developer Tools > Lombok <br>
Web > Spring Web <br> 
Messaging > Spring for RabbitMQ <br><br>
SQL > Spring Data JPA
SQL > H2 Database

Добавляем README.md

src/main/resources/application.properties - используем для настроек H2
src/main/resources/application.yml - используем для настроек RabbitMQ
