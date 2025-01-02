package org.example.javaBased;

public class Desktop implements Computer {
//    public Desktop() {
//        System.out.println("This is desktop");
//    }

    @Override
    public void compile() {
        System.out.println("Compiling from desktop...");
    }
}
