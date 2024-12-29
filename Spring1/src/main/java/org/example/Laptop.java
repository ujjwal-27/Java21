package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("This is laptop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling from laptop");
    }
}
