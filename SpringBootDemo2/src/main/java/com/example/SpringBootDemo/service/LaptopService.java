package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addlaptop(Laptop laptop) {
        System.out.println("Method from laptop service.");
    }
}
