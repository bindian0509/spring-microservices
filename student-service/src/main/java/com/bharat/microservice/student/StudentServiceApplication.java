package com.bharat.microservice.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.bharat.microservice.student"})
@EntityScan("com.bharat.microservice.student.model.entity")
@EnableJpaRepositories("com.bharat.microservice.student.model.repository")
@EnableFeignClients("com.bharat.microservice.student.service")
public class StudentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

}
