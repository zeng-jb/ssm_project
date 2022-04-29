package com.zeng.demo02;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        //代理的操作
        userServiceProxy.add();
    }
}
