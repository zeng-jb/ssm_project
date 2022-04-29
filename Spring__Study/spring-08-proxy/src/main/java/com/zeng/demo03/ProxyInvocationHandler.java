package com.zeng.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态生成代理
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public ProxyInvocationHandler() {
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHost();
        //动态代理的本质，使用反射机制实现
        Object result = method.invoke(rent,args);
        fare();
        return null;
    }

    public void seeHost(){
        System.out.println("中介带看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
