package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
     * Here, all the processing is executed using servlet. (This can be done using Spring approach. Check next commit for it.)
     * @param req Getting request from client using servlet (This can be done using Spring approach as well).
     * @param session Http session
     * @return View page displaying sum of two integers.
     */
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        // getting integers 'num1' and 'num2' as query parameter.
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//
//        session.setAttribute("result", result); // setting result in session named as 'result'
//
//        return "result.jsp";
//    }

    /**
     * Here, Spring approach is implemented to get values from query param.
     * @param num1 [Integer] The variable name must exactly match with query parameter
     * @param num2 [Integer] The variable name must exactly match with query parameter
     * @param session Http Session
     * @return View page displaying sum of two integers.
     */
    @RequestMapping("/add")
    public String add(int num1, int num2, HttpSession session) {
        int result = num1 + num2;

        session.setAttribute("result", result); // setting result in session named as 'result'

        return "result.jsp";
    }
}
