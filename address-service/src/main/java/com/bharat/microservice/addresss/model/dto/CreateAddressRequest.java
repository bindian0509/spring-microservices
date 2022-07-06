package com.bharat.microservice.addresss.model.dto;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

public class CreateAddressRequest {

    private String street;

    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
