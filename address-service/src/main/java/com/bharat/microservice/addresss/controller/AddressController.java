package com.bharat.microservice.addresss.controller;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

import com.bharat.microservice.addresss.model.dto.AddressResponse;
import com.bharat.microservice.addresss.model.dto.CreateAddressRequest;
import com.bharat.microservice.addresss.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/")
    public AddressResponse createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/{id}")
    public AddressResponse getById(@PathVariable long id) {
        return addressService.getById(id);
    }
}