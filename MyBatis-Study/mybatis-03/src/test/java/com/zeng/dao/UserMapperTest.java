package com.zeng.dao;

import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test1(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql，方式一
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userList = mapper.getUserById(1);
        System.out.println(userList);


        //关闭SQLSession
        sqlSession.close();
    }

}
