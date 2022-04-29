package com.zeng.mapper;

import com.zeng.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{



    public List<User> seleUser() {

        UserMapper mapper = getSqlSessionTemplate().getMapper(UserMapper.class);

        User user = new User(4, "小王", "111111");
        mapper.addUser(user);
        mapper.deleteUser(3);
        return mapper.seleUser();
    }

    public int addUser(User user) {
        return getSqlSessionTemplate().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSessionTemplate().getMapper(UserMapper.class).deleteUser(id);
    }
}
