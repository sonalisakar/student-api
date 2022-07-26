package com.bksoft.studentapi.service;

import com.bksoft.studentapi.model.Address;
import com.bksoft.studentapi.model.Student;
import com.bksoft.studentapi.repository.AddressRepository;
import com.bksoft.studentapi.repository.StudentDAO;
import com.bksoft.studentapi.repository.StudentRepository;
import org.apache.commons.math3.analysis.function.Add;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentService {


        @Autowired
        private StudentRepository studentRepository;

        @Autowired
        private AddressRepository addressRepository;

        public Student insertStudent(Student student) {

                Student db = studentRepository.save(student);

                return db;
        }

        public Student getStudent(int rollno) {
            Optional<Student>  studentOptional=studentRepository.findById(rollno);
            if(studentOptional.isPresent())
                    return studentOptional.get();
            else
                    return null;

        }

        public void removeStudent(int rollno) {

                studentRepository.deleteById(rollno);
        }

        public Student updateStudent(int rollno, Student student) {

                return studentRepository.save(student);
        }
}
