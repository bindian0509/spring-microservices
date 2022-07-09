package com.bharat.microservice.student.service;

import com.bharat.microservice.student.model.dto.AddressResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author bharat.verma
 * @created Saturday, 09 July 2022
 */
@Service
public class CircuitBreakedEnabledService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private long count = 1;

    @Autowired
    private AddressFeignClient addressFeignClient;

    @CircuitBreaker(name = "addressService", fallbackMethod = "fallbackGetAddressId")
    public AddressResponse getAddressById (long addressId) {
        logger.info("> count : "+count);
        count++;
        AddressResponse addressResponse = addressFeignClient.getById(addressId);
        return addressResponse;
    }

    public AddressResponse fallbackGetAddressId (long addressId, Throwable th) {
        logger.error("To Error : "+th);
        return new AddressResponse();
    }
}
