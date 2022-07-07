package com.bharat.microservice.address.repository;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */


import com.bharat.microservice.address.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
