package com.example.spring_data_jpa_example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity // Inorder to create table based on this class using Spring Data JPA, the model class must be declared as entity using this annotation.
public class Student {
    @Id // This annotation determines the primary key of the table 'student'
    private int roll_no;
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollNo(int rollNo) {
        this.roll_no = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
