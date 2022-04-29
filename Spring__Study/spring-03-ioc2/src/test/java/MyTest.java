import com.zeng.pojo.User;
import com.zeng.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //User user = new User();
        //spring容器，类似已经在xml创建
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserT user = (UserT) context.getBean("u1");

        user.show();
    }
}
