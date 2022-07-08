package com.bharat.microservice.student.service;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

/*
 * @author bharat.verma
 * @created Friday, 08 July 2022
 */
/*@LoadBalancerClient(value = "address-service")
public class AddressServiceLoadBalancerConfig {

    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder () {
        return Feign.builder();
    }
}*/
