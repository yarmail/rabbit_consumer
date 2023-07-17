package com.example.rabbit_consumer.repository;

import com.example.rabbit_consumer.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
