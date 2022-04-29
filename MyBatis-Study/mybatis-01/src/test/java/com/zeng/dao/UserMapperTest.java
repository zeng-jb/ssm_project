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

    @Test
    public void getUserById(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(2);
        System.out.println(user);

        //关闭SQLSession
        sqlSession.close();
    }

    @Test
    public void getUserById2(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("id",1);

        //关闭SQLSession
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUser(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(4,"哈哈","123000"));

//        提交事务,必须需要提交事务
        sqlSession.commit();
        //关闭SQLSession
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("id",5);
        map.put("name","hello");
        map.put("pwd",23333);

        userMapper.addUser2(map);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void updateUser(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4,"hehe","123000"));

//        提交事务,必须需要提交事务
        sqlSession.commit();
        //关闭SQLSession
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void deleteUser(){
        //第一步，获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(4);
//        提交事务,必须需要提交事务
        sqlSession.commit();
        //关闭SQLSession
        sqlSession.close();
    }
}
