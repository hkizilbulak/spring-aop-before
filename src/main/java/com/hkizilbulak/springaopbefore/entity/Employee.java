package com.hkizilbulak.springaopbefore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@RedisHash(value = "Employee")
public class Employee implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
}
