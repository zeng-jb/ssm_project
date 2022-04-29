package com.zeng.controller;

import com.zeng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    //http://localhost:8080/user/t1?username=zengjiabin
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //接收前端参数
        System.out.println("接收前端的参数"+name);
        //将结果返回前端
        model.addAttribute("msg",name);
        //视图跳转
        return "test";
    }
    //http://localhost:8080/user/t2?id=1&name=zengjiabin&age=18
    @GetMapping("/t2")
    public String test2(User user, Model model){
        //接收前端参数
        System.out.println(user);

        //视图跳转
        return "test";
    }
}
