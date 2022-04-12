package com.baizhi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view1")
public class View1Controller {

    @RequestMapping("/view3")
    public String view3() {
        System.out.println("ViewController.view2");
        return "redirect:/result.jsp";
    }

    @RequestMapping("/view2")
    public String view2() {
        System.out.println("ViewController.view2");
        return "forward:/result.jsp";
    }

    @RequestMapping("/view1")
    public String view1() {
        System.out.println("ViewController.view1");
        return "result";
    }
}
