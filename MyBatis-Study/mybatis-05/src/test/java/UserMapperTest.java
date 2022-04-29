import com.zeng.dao.UserMapper;
import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public  void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        userMapper.deleteUser(4);

        sqlSession.close();

    }

/*
        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        User userById = userMapper.getUserById(2);
        System.out.println(userById);



       userMapper.addUser(new User(4,"nihao","121212"));


       userMapper.updateUser(new User(4,"tototo","123456"));
 */

}
