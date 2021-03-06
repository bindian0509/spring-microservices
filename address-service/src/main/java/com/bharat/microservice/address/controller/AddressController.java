package com.bharat.microservice.address.controller;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

import com.bharat.microservice.address.model.dto.AddressResponse;
import com.bharat.microservice.address.model.dto.CreateAddressRequest;
import com.bharat.microservice.address.service.AddressService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
@RefreshScope
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Value("${address.test:default}")
    private String serverType;

    @PostMapping("/")
    public AddressResponse createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/{id}")
    @Timed(value = "getById.time", description = "Time taken to return address by id")
    public AddressResponse getById(@PathVariable long id) {
        return addressService.getById(id);
    }

    @GetMapping("/test")
    public String test() {
        return serverType;
    }

    @GetMapping("/hello")
    @RateLimiter(name = "hello", fallbackMethod = "helloFeedback")
    public String hello() {
        return "Hello, Welcome to Spring Boot Microservice...!!!";
    }

    private String helloFeedback(Throwable t) {
        return "Hey you have exceeded my welcoming request, back off :| ";
    }

}