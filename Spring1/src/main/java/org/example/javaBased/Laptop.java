package org.example.javaBased;

import org.springframework.stereotype.Component;

@Component("imac")
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling from laptop");
    }

}
