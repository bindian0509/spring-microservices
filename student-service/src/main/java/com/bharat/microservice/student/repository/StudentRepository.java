package com.bharat.microservice.student.repository;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

import com.bharat.microservice.student.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {



}