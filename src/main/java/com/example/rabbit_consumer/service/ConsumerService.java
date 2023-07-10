package com.example.rabbit_consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.rabbit_consumer.domain.User;
import com.example.rabbit_consumer.repository.UserRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    public ConsumerService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receivedMessage(User user) {
        User save = userRepository.save(user);
        logger.info("-------------------");
        logger.info("persisted " + save);
        logger.info("User recieved " + user);
        logger.info("-------------------");
    }
}