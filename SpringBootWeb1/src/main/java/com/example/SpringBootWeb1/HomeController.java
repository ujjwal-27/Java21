package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/","/home"})
    public String home() {
        System.out.println("Home controller called");
        return "index.jsp";
    }
}
