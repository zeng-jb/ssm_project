package com.zeng.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        //业务代码
        String result = "HelloSpringMVC";

        modelAndView.addObject("msg",result);
        //事务跳转
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
