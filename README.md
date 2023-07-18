<h3>RabbitMQ Connect</h3>
Проект состоит из двух микросервисов, соединенных RabbitMQ:<br>
~ <a href="https://github.com/yarmail/rabbit_producer">rabbit_producer</a> <br>
~ rabbit_consumer (данный проект)<br>
<b>Одна из идей проекта</b> - создание кода в одной ОС (в данном случае Windows 7)<br>
а запуск кода в другой OC (в данном случае Ubuntu) за счет использования Docker.<br>
<b>Важно:</b> Описание сборки и проверка работоспособности будет происходить <br>
в проекте rabbit_producer. <br><br>

<details>
<summary>Примечание: информация о проекте</summary>
Большая часть информация о проекте: примечания, описания, 
объяснения, картинки, комментарии <br> 
находятся в папке <b><a href="/01_info">01_info</a></b>.<br>

</details> <br>

Общая схема проекта<br>
<img src="/01_info/schema.png" alt=""><br>

Описание проекта rabbit_consumer:<br>
Данный микросервис rabbit_consumer получает от брокера RabbitMQ сообщение<br>
с данными пользователя и сохраняет их в базу данных H2<br> 

<a href="/01_info/010_create_project/CREATE.md">010 Создание проекта rabbit_consumer</a> <br>
Информация о создании нового проекта, настройки проекта <br><br>

<a href="/01_info/020_work_with_rabbitmq/RABBIT.md">020 Работа с RabbitMQ со стороны проекта </a> <br>
Зависимости, настройка application.yml, немного теории <br><br>