package com.baizhi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Scope("prototype")
public class FirstController {

    public FirstController(){
        System.out.println("FirstController.FirstController");
    }

    @RequestMapping(value = {"first", "third"})
    public String first(HttpServletRequest request, HttpServletResponse response){
        System.out.println("FirstController.first");
        return "/result.jsp";
    }

    @RequestMapping("suns/second")
    public String second(HttpServletRequest request, HttpServletResponse response){
        System.out.println("FirstController.second");
        return "/result2.jsp";
    }
}
