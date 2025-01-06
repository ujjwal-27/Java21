package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.model.Laptop;
import com.example.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;

    public void addlaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }
}
