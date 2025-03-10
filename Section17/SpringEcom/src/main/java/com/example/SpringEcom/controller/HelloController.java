package com.example.SpringEcom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloController {
    @GetMapping("hello")
    public String greet() {
        return "This is Spring Ecommerce";
    }
}
