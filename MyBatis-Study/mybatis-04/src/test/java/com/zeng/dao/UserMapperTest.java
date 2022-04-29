package com.zeng.dao;

import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

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

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);

        }

        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds分页实现
        RowBounds rowBounds = new RowBounds(1,2);

        //通过java代码层实现分页
        List<User> selectList = sqlSession.selectList("com.zeng.dao.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : selectList) {
            System.out.println(user);
        }

        sqlSession.close();

    }

    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }
}
