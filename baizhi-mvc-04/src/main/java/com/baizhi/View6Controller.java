package com.baizhi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view6")
public class View6Controller {

    @RequestMapping("/view1")
    public String view1() {
        System.out.println("View6Controller.view1");
        return "redirect:/result5";
    }

}
