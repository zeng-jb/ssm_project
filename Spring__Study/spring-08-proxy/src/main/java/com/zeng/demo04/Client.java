package com.zeng.demo04;

import com.zeng.demo02.UserService;
import com.zeng.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色 ，目前不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置要处理的对象
        proxyInvocationHandler.setTarget(userService);
        //生成动态代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        //代理方法操作
        proxy.add();
    }
}
