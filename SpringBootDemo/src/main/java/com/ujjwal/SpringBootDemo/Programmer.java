package com.ujjwal.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    @Autowired
    Laptop laptop;

    @Autowired
    Cpu cpu;

    public void code() {
        System.out.println("Coding...");

        laptop.compile();
    }

    public void write() {
        System.out.println("Write code..");

        cpu.turnOn();
    }
}
