package com.tuempresa.msstudentservice.repository;

import com.tuempresa.msstudentservice.model.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {
}