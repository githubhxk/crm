package com.baizhi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("encoding")
public class EncodingController {



    @RequestMapping("encoding1")
    public String encoding1(String name, String password) {
        System.out.println("name = " + name);
        System.out.println("password = " + password);
        return "param1";
    }
}
