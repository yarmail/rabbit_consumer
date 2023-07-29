package com.example.rabbit_consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = {"rabbitmq.queue.name"}  )
    public void receivedMessage(String message) {
        System.out.println("Сообщение дошло. Текст сообщения: " + message);
    }
}