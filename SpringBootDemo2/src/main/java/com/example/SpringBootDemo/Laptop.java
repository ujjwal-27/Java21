package com.example.SpringBootDemo;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }

    public void compile() {
        System.out.println("Compiling from Laptop...");
    }
}
