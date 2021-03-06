package com.bharat.microservice.student.service;

import com.bharat.microservice.student.model.dto.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */
@FeignClient(value = "api-gateway")
public interface AddressFeignClient {

    @GetMapping("/address-service/api/address/{id}")
    public AddressResponse getById(@PathVariable long id);

}
