package com.bharat.microservice.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EntityScan("com.bharat.microservice.address.model.entity")
@EnableJpaRepositories("com.bharat.microservice.address.repository")
@EnableEurekaClient
public class AddressServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressServiceApplication.class, args);
    }

}
