package com.zeng.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//只要实现了Controller接口的类，说明这是一个控制器了
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","ControllerTest1");
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
