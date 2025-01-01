package org.example.xmlBased;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling from desktop");
    }
}
