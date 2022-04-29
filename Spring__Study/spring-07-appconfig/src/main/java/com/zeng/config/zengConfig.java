package com.zeng.config;

import com.zeng.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(zengConfig2.class)
@Configuration
//javaConfig  这个也会被spring容器托管，注册到容器，因为他本身就是一个@Component,
// @Configuration 代表一个配置类，和之前xml配置一样，bean.xml
@ComponentScan("com.zeng.pojo")
//扫描这个类
public class zengConfig {
    @Bean
    //注册一个bean，就相当与之前的一个bean标签
    //这个方法的名字，就相当于bean中标签的属性值
    //这个方法的返回值，就相当于这个bean标签中的class的属性
    public User getUser(){
        return new User();  // 就是返回bean的注入对象
    }
}
