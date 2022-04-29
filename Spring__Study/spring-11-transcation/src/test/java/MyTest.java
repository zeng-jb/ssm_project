import com.zeng.mapper.UserMapper;
import com.zeng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("UserMapperImpl", UserMapper.class);
        for (User user : userMapper.seleUser()) {
            System.out.println(user);
        }
    }
}