package com.bksoft.studentapi.repository;

import com.bksoft.studentapi.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {
    private Map<Integer,Student> studentMap=new HashMap<>();

    public Student insertStudent(Student student){
        studentMap.put(student.getRollNo(), student);
        return studentMap.get(student.getRollNo());
    }

    public Student getStudent(int rollno) {
        return studentMap.get(rollno);
    }

    public void removeStudent(int rollno) {
        studentMap.remove(rollno);
    }

    public Student updateStudent(int rollno, Student student) {
        studentMap.put(rollno,student);
        return studentMap.get(rollno);
    }
}
