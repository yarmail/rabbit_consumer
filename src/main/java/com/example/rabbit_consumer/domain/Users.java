package com.example.rabbit_consumer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String userName;
}

/*
Примечание:
При использовании модели User ругается H2:
org.h2.jdbc.JdbcSQLSyntaxErrorException ... Syntax error in SQL statement "create table [*]user ..."
Как я полагаю User зарезервированное слово в H2 поэтому поменял на Users.
Именно эта ошибка ушла.
 */