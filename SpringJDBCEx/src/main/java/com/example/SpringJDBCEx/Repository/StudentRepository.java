package com.example.SpringJDBCEx.Repository;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public void save(Student student) {
        System.out.println("Student " + student.getName() + " added.");
    }
}
