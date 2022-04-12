package com.baizhi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/view2")
public class View2Controller {

    @RequestMapping("/view3")
    public String view3(ModelMap modelmap){
        System.out.println("View2Controller.view1");
        modelmap.addAttribute("name", "xjr");
        return "result1";
    }
    @RequestMapping("/view2")
    public String view2(Model model){
        System.out.println("View2Controller.view1");
        model.addAttribute("name", "xjr");
        return "redirect:/result1.jsp";
    }
    @RequestMapping("/view1")
    public String view1(HttpServletRequest request){
        System.out.println("View2Controller.view1");
        request.setAttribute("name", "xjr");
        return "result1";
    }
}
