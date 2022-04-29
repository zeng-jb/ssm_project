import com.zeng.config.zengConfig;
import com.zeng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        //如果完全使用了配置方式去做，我们只能通过AnnotationConfig上下文去配置容器，通过容器加载到对象
        ApplicationContext context = new AnnotationConfigApplicationContext(zengConfig.class);
        User getUser = context.getBean("getUser",User.class);
        System.out.println(getUser.getName());
    }
}
