import com.zeng.service.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service serviceImpl = (service) context.getBean("ServiceImpl");
        String tablename = "mytable";
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        serviceImpl.createAutoTaskResult(tablename,list);
    }
}
