package com.zeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//代表这个类会被Spring接管，被这个注解的类中的所有的方法，如果返回值是String ,并且有具体界面可以跳转，那么就会被视图解析器解析。
@Controller
public class ControllerTest2 {
    @RequestMapping(value = "/t2",method = RequestMethod.POST)
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
    @RequestMapping("/t3")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest3333");
        return "test";
    }
}
