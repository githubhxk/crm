package com.baizhi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/view3")
@SessionAttributes(value = {"name","address"})
public class View3Controller {

    @RequestMapping("view1")
    public String view1(Model model) {
        model.addAttribute("name", "sunss");
        model.addAttribute("age", "22");
        return "forward:/view3/view2";
    }

    @RequestMapping("view2")
    public String view2(SessionStatus sessionStatus) {
        if(!sessionStatus.isComplete()) {
            sessionStatus.setComplete();
        }
        return "result2";
    }
}
