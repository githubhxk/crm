package com.baizhi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view5")
public class View5Controller {

    @RequestMapping("/view1")
    public ModelAndView view1() {
        ModelAndView modelAndView = new ModelAndView();
        ModelMap modelMap = modelAndView.getModelMap();
        modelMap.addAttribute("name", "xhh");
        modelAndView.setViewName("result4");
        return modelAndView;
    }


}
