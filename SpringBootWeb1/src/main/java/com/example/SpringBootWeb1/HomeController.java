package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() {
        return "index.jsp";
    }
}
