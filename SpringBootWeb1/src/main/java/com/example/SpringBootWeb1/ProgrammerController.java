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

    /**
     * In this method, instead of accepting data from form through multiple parameters, we are accepting whole programmer model in the form of data.
     * Note that, for this to work, the name of form field must match with the properties of programmer model.
     * This is an example of using ModelAttribute.
     * The parameter can also be written as: (@ModelAttribute("data") Programmer programmer). This is optional, and not really required until we need to change the name of data we are sending.
     * If the attributeName is set, then that attributeName must be used in view page.
     * @param programmer [Programmer] An object of programmer
     * @return [String] View page: programmerResult
     */
    @RequestMapping("/addProgrammer")
    public String addProgrammer(Programmer programmer) {
        return "programmerResult";
    }

//    @RequestMapping("/addProgrammer")
//    public ModelAndView addProgrammer(int programmerId, String programmerName, ModelAndView mv) {
//        Programmer programmer = new Programmer();
//        programmer.setProgrammerId(programmerId);
//        programmer.setProgrammerName(programmerName);
//
//        mv.addObject("programmer", programmer);
//        mv.setViewName("programmerResult");
//
//        return mv;
//    }
}
