package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public void addStudent(Student student) {
        System.out.println("Student " + student.getName() + " added.");
    }
}
