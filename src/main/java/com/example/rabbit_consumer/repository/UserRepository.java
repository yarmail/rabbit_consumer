package com.example.rabbit_consumer.repository;

import com.example.rabbit_consumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
