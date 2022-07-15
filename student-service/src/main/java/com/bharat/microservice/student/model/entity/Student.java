package com.bharat.microservice.student.model.entity;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address_id")
    private long addressId;

    public Student setId(Long id) {
        this.id = id;
        return this;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student setAddressId(long addressId) {
        this.addressId = addressId;
        return this;
    }

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email, long addressId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
    }

    public Student build () {
        return new Student(id, firstName, lastName, email, addressId);
    }
}
