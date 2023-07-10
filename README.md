<h3>RabbitMQ Connect</h3>
Проект состоит из двух микросервисов, соединенных RabbitMQ:<br>
- <a href="https://github.com/yarmail/rabbit_producer">rabbit_producer</a> <br>
- rabbit_consumer (данный проект)<br>

<details>
<summary>Примечание: информация о проекте</summary>
Большая часть информация о проекте: примечания, описания, 
объяснения, картинки, комментарии <br> 
находятся в папке <b><a href="/01_info">01_info</a></b>.<br>
**Важно:** тестирование проекта будет проходить с помошью Ubuntu и Docker.<br>
Описание сборки и тестирования будет происходить в проекте rabbit_producer.<br>
</details> <br>

Общая схема проекта<br>
(картинку сюда)<br>

Описание проекта rabbit_consumer:
Данный микросервис rabbit_consumer получает от брокера RabbitMQ сообщение<br>
с данными пользователя и сохраняет их в базу данных H2<br> 

<a href="/01_info/010_create_project/CREATE.md">010 Создание проекта rabbit_consumer</a> <br>
Информация о создании нового проекта, настройки проекта <br><br>

<a href="/01_info/020_work_with_rabbitmq/RABBIT.md">020 Работа с RabbitMQ со стороны проекта </a> <br>
Зависимости, настройка application.yml, немного теории <br><br>