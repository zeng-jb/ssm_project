package com.zeng.dao;

import com.zeng.pojo.User;

import java.util.List;

public interface UserMapper {

    //根据ID查询用户
    public User getUserById(int id);

}
