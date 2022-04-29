package com.zeng.dao;

import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test1(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql，方式一
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SQLSession
        sqlSession.close();
    }

}
