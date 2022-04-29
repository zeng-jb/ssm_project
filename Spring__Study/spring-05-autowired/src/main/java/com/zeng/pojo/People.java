package com.zeng.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/*
Autowired和Resource的区别
都是用来自动装配的，都可以放在属性字段上
Autowired默认通过ByType的方式实现
Resource默认通过Byname的方式实现，找不到则通过ByType实现
 */

public class People {

    private String name;
//    @Autowired(required = false)
//    @Qualifier(value = "dog22") //指定装配一个beanid
    //如果现实定义了Autowired的required的属性为false，说明这个对象可以为null，否则不能为空
    @Resource  //java注解
    private Dog dog;
//    @Autowired
    @Resource(name = "cat11")
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
