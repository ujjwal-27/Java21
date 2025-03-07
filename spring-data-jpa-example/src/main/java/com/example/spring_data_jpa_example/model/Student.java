package com.example.spring_data_jpa_example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
    private int roll_no;
    private int marks;
    private String name;

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
