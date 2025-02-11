package com.example.JobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }
}
