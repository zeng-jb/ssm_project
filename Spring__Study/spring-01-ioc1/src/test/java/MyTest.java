import com.zeng.dao.UserDaoImpl;
import com.zeng.dao.UserDaoMySqlImpl;
import com.zeng.dao.UserDaoOracorImpl;
import com.zeng.service.UserService;
import com.zeng.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        service.getUser();


//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao(new UserDaoOracorImpl());
//        service.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("service");
        serviceImpl.getUser();


    }
}
