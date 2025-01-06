package com.example.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("27")
    private int age;
    private Computer computer;

    public int getAge() {
        return age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        computer.compile();
    }
}
