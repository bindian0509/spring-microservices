package com.bharat.microservice.student.service;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

import com.bharat.microservice.student.model.dto.CreateStudentRequest;
import com.bharat.microservice.student.model.dto.StudentResponse;
import com.bharat.microservice.student.model.entity.Student;
import com.bharat.microservice.student.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CircuitBreakedEnabledService commonService;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Student student = new Student()
                .setFirstName(createStudentRequest.getFirstName())
                .setLastName(createStudentRequest.getLastName())
                .setEmail(createStudentRequest.getEmail())
                .setAddressId(createStudentRequest.getAddressId())
                .build();
        student = studentRepository.save(student);

        StudentResponse studentResponse = new StudentResponse(student);
        //studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
        studentResponse.setAddressResponse(commonService.getAddressById(student.getAddressId()));
        return studentResponse;
    }

    public StudentResponse getById (long id) {
        logger.info("# Fetching Student by get Id for Id : "+id);
        Student student = studentRepository.findById(id).get();
        StudentResponse studentResponse = new StudentResponse(student);
        //studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
        studentResponse.setAddressResponse(commonService.getAddressById(student.getAddressId()));

        return studentResponse;
    }


}
