package com.tuempresa.msstudentservice.controller;

import com.tuempresa.msstudentservice.model.Student;
import com.tuempresa.msstudentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public Flux<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Mono<Student> createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}