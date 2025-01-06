package com.example.SpringBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compiling in Desktop...");
    }
}
