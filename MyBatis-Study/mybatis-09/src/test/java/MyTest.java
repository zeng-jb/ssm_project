import com.zeng.dao.UserMapper;
import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.queryUserByID(1);
        System.out.println(user1);
        System.out.println("==================");
        //mapper.updateUserByID(new User(2,"aaaa","bbbb"));
        sqlSession.clearCache();//手动清理缓存
        User user2 = mapper.queryUserByID(1);
        System.out.println(user2);
        System.out.println(user1==user2);
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.queryUserByID(1);
        System.out.println(user1);
        sqlSession.close();
        //二级缓存生效，在一级缓存关闭或者无效时，将内容缓存进二级
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserByID(1);
        System.out.println(user2);
        System.out.println(user1==user2);
        sqlSession2.close();
    }
}
