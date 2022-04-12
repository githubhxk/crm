package com.baizhi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/view4")
public class View4Controller {

    @RequestMapping("/view1")
    public String view1(@ModelAttribute("name") String name) {
        System.out.println("View4Controller.view1");
        System.out.println("name="+name);
        return "result3";
    }

    @RequestMapping("/view2")
    public String view2(@ModelAttribute("u") User user) {
        System.out.println("View4Controller.view2");
        System.out.println("user="+user);
        return "result3";
    }
}
