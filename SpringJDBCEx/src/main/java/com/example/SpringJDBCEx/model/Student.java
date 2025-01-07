package com.example.SpringJDBCEx.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int marks;
    private String name;
    private int rollNo;

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
}
