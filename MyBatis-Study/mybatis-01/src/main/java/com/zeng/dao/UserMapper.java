package com.zeng.dao;

import com.zeng.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    public List<User> getUserList();
    //根据ID查询用户
    public User getUserById(int id);
    //根据ID查询用户
    public User getUserById2(Map<String,Object> map);
    //插入一个用户，insert
    public int addUser(User user);
    //插入一个用户，insert,,,万能的map
    public int addUser2(Map<String,Object> map);
//    修改一个用户
    public int updateUser(User user);
    //删除一个用户
    public int deleteUser(int id);
}
