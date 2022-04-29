package com.zeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncondingController {
    //用过滤器解析
    @PostMapping("/e")
    public String test(Model model ,String name){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
