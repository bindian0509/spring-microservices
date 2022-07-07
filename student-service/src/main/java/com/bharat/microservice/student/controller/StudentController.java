package com.bharat.microservice.student.controller;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */

import com.bharat.microservice.student.model.dto.CreateStudentRequest;
import com.bharat.microservice.student.model.dto.StudentResponse;
import com.bharat.microservice.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/")
    public StudentResponse createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
        return studentService.createStudent(createStudentRequest);
    }

    @GetMapping("/{id}")
    public StudentResponse getById (@PathVariable long id) {
        return studentService.getById(id);
    }

}