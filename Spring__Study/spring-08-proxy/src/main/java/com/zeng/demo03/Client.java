package com.zeng.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色，没有创建
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);

        //proxy是动态生成的，
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
