package com.zeng.dao;

import com.zeng.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    User queryUserByID(@Param("id") int id);

    int updateUserByID(User user);
}
