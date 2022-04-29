package com.zeng.dao;

import com.zeng.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    public List<User> getUserList();
    //根据ID查询用户
    public User getUserById(int id);

    //插入一个用户，insert
    public int addUser(User user);

//    修改一个用户
    public int updateUser(User user);
    //删除一个用户
    public int deleteUser(int id);
}
