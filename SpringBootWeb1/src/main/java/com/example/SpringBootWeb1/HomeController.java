package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * In spring boot, always use @Controller annotation for a controller class
 */
@Controller
public class HomeController {

    /**
     * @RequestMapping This annotation is used to map 'url' with this method -> home, which loads view page.
     * The url is defined in the param of annotation.
     * Multiple url can be defined using array.
     * @return View page -> index.jsp
     */
    @RequestMapping({"/","/home"})
    public String home() {
        System.out.println("Home controller called");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add() {
//        System.out.println("add invoked");
        return "result.jsp";
    }
}
