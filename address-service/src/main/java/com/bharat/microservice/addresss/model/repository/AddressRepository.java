package com.bharat.microservice.addresss.model.repository;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */


import com.bharat.microservice.addresss.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
