package com.example.rabbit_consumer.service;

import com.example.rabbit_consumer.domain.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @RabbitListener(queues = "user.queue")
    public void receivedMessage(Users user) {
        //Users save = userRepository.save(user);
        logger.info("-------------------");
        //logger.info("persisted " + save);
        logger.info("User recieved " + user);
        logger.info("-------------------");
    }
}