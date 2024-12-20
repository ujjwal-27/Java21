package com.ujjwal.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Cpu {

    public void processor() {
        System.out.println("Processing...");
    }

    public void turnOn() {
        System.out.println("turning on...");
    }
}
