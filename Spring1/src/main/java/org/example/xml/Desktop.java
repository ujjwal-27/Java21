package org.example.xml;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling from desktop");
    }
}
