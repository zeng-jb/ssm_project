package com.zeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFullController {

//    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
//    public String test1(@PathVariable int a,@PathVariable int b, Model model){
//
//        //http://localhost:8080/add?a=1&b=2 原来风格
//        //RestFull风格：http://localhost:8080/add/a/b
//        int res = a + b;
//        model.addAttribute("msg","结果为"+res);
//        return "admin/test";
//    }
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable String a,@PathVariable String b, Model model){

        //http://localhost:8080/add?a=1&b=2 原来风格
        //RestFull风格：http://localhost:8080/add/a/b
        String res = a + b;
        model.addAttribute("msg","结果1为"+res);
        return "test";
    }
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){

        //http://localhost:8080/add?a=1&b=2 原来风格
        //RestFull风格：http://localhost:8080/add/a/b
        int res = a + b;
        model.addAttribute("msg","结果2为"+res);
        return "test";
    }
}
