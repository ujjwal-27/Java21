package com.example.SpringBootDemo.repository;

import com.example.SpringBootDemo.model.Laptop;

public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Saved in database");
    }
}
