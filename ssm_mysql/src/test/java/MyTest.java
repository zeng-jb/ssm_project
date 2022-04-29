
import com.zeng.pojo.Students;
import com.zeng.service.StudentService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class MyTest {

    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    //测试数据库，dao层和service层
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        List<Students> list = studentServiceImpl.queryAllStudent();
        for (Students students : list) {
            System.out.println(students);
        }
    }

    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }

    @Test
    public void testQueryBlogChoose(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("sid","20183602139");
//        map.put("sname","曾嘉彬");
//        map.put("age",23);
        map.put("sex","男");

        List<Students> studentsList = studentServiceImpl.queryStudentChoose(map);

        System.out.println(studentsList);
    }


    @Test
    public void transactionTest(){
        //声明式事务处理
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        //出错设在mapper.xml中deletes。。。
        studentServiceImpl.transactionTest();
    }

}
