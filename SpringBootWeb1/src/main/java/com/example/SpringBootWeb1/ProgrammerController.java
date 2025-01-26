package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProgrammerController {

    @RequestMapping("/programmerForm")
    public ModelAndView programmerForm(ModelAndView mv) {
        mv.setViewName("programmerForm");

        return mv;
    }

    @RequestMapping("/addProgrammer")
    public ModelAndView addProgrammer(int pid, String name, ModelAndView mv) {
        Programmer programmer = new Programmer();
        programmer.setProgrammerId(pid);
        programmer.setProgrammerName(name);

        mv.addObject("programmer", programmer);
        mv.setViewName("programmerResult");

        return mv;
    }
}
