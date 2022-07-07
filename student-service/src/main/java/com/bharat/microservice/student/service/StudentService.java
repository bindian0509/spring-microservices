package com.bharat.microservice.student.service;
/*
 * @author bharat.verma
 * @created Thursday, 07 July 2022
 */
import com.bharat.microservice.student.model.dto.AddressResponse;
import com.bharat.microservice.student.model.dto.CreateStudentRequest;
import com.bharat.microservice.student.model.dto.StudentResponse;
import com.bharat.microservice.student.model.entity.Student;
import com.bharat.microservice.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressFeignClient addressFeignClient;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Student student = new Student();
        student.setFirstName(createStudentRequest.getFirstName());
        student.setLastName(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());

        student.setAddressId(createStudentRequest.getAddressId());
        student = studentRepository.save(student);

        StudentResponse studentResponse = new StudentResponse(student);

        //studentResponse.setAddressResponse(getAddressById(student.getAddressId()));

        studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));

        return studentResponse;
    }

    public StudentResponse getById (long id) {
        Student student = studentRepository.findById(id).get();
        StudentResponse studentResponse = new StudentResponse(student);

        //studentResponse.setAddressResponse(getAddressById(student.getAddressId()));

        studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));

        return studentResponse;
    }

    public AddressResponse getAddressById (long addressId) {
        Mono<AddressResponse> addressResponse =
                WebClient.create().get().uri("/" + addressId)
                        .retrieve().bodyToMono(AddressResponse.class);

        return addressResponse.block();
    }
}
