package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * In spring boot, always use @Controller annotation for a controller class
 * @RequestMapping The request mapping in all the methods are being done by dispatcher servlet.
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
        return "index.jsp"; // return view page
    }


    /**
     *
     * @param req Getting request from client using servlet (This can be done using Spring approach as well).
     * @return View page displaying sum of two integers.
     */
    @RequestMapping("/add")
    public String add(HttpServletRequest req) {
        // getting integers 'num1' and 'num2' from url parameter.
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;

        System.out.println(result);
        return "result.jsp";
    }
}
