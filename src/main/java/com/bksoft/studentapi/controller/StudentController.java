package com.bksoft.studentapi.controller;

import com.bksoft.studentapi.model.Student;
import com.bksoft.studentapi.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController{

    @Autowired
    private StudentService studentService;


    @GetMapping("/student/{roll-no}")
    public Student getStudent(@PathVariable("roll-no") int rollno){
        //Student std=Student.builder().rollNo(1).name("basu").build();
        return studentService.getStudent(rollno);
    }
    @DeleteMapping("/student/{roll}")
    public void deleteStudent(@PathVariable("roll") int rollno){
        studentService.removeStudent(rollno);
    }
    @PutMapping("/student/{roll}")
    public Student updateStudent(@PathVariable("roll") int rollno , @RequestBody Student student){
       return studentService.updateStudent(rollno,student);

    }

    /*@PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        //Student std=Student.builder().rollNo(1).name("basu").build();
        System.out.println(student.getName());
    }*/
    @PostMapping("/student")

    public  Student insert(@RequestBody Student std)
    {
        return studentService.insertStudent(std)   ;

    }
}
