package com.proyecto.msstudentservice.service;

import com.proyecto.msstudentservice.model.Student;
import com.proyecto.msstudentservice.repository.StudentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Mono<Student> createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Mono<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Flux<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Mono<Void> deleteStudent(Long id) {
        return studentRepository.deleteById(id);
    }
}
