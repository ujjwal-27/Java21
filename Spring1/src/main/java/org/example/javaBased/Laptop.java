package org.example.javaBased;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("This is laptop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling from laptop");
    }

}
