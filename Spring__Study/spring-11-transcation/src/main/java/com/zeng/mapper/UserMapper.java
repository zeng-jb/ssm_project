package com.zeng.mapper;

import com.zeng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
   public List<User> seleUser();
   //增加一个用户
   public int addUser(User user);
   //删除一个用户
   public int deleteUser(@Param("id") int id);
}
