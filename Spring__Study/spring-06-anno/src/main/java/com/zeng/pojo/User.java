package com.zeng.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//相当于     <bean id="user" class="com.zeng.pojo.User"/> ，主键
@Scope("prototype")
//作用域
public class User {
    @Value("zengjiabin")
    //相当于property，，也可以放在set方法上
    public String name;
}
