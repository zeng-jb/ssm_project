package com.zeng.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用aop方式三，使用注解实现aop
@Aspect   //标注这个类是一个切面
public class AnnotationPointCut {
    @Before(value = "execution(* com.zeng.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法执行前====");
    }
    @After(value = "execution(* com.zeng.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====方法执行完后====");
    }
    //在环绕增强中，可以给定一个参数，代表我们的切入点
    @Around(value = "execution(* com.zeng.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature:"+signature);
        //执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");

        System.out.println(proceed);
    }
}
