package com.bksoft.studentapi.repository;

import com.bksoft.studentapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
