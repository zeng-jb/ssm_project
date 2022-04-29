package com.zeng.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zeng.pojo.User;
import com.zeng.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController   //以下的方法直接返回字符串
public class UserController {

    //produces:指定响应体返回类型和编码
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
    //@ResponseBody   //他不会走视图解析器，会直接返回一个字符串
    public String json() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("曾嘉彬",3,"男");
        String s = mapper.writeValueAsString(user);
        return s;
    }
    @RequestMapping("/j2")
    public String json1() throws JsonProcessingException {


        ArrayList<User> userlist = new ArrayList<User>();
        User user1 = new User("曾嘉彬1",3,"男");
        User user2 = new User("曾嘉彬2",3,"男");
        User user3 = new User("曾嘉彬3",3,"男");
        User user4 = new User("曾嘉彬4",3,"男");
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);

        //return new ObjectMapper().writeValueAsString(userlist);
        return JsonUtils.getJson(userlist);
    }

    @RequestMapping("/j3")
    //@ResponseBody   //他不会走视图解析器，会直接返回一个字符串
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(sdf);
        Date date = new Date();

        return mapper.writeValueAsString(date);
    }
    @RequestMapping("/j4")
    //@ResponseBody   //他不会走视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j5")
    //@ResponseBody   //他不会走视图解析器，会直接返回一个字符串
    public String json4() throws JsonProcessingException {
        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

        return new String(JSON.toJSONString(list));
    }
}
