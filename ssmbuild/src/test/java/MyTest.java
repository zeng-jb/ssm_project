import com.zeng.pojo.Books;
import com.zeng.service.BookService;
import com.zeng.service.SqlService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        String name = "Java";
        Books books = bookServiceImpl.queryBookByName(name);
        System.out.println(books);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlService sqlServiceImpl = (SqlService) context.getBean("SqlServiceImpl");
        String newTabelName = "testtable";
        List<Map<String, String>> list = new ArrayList<Map<String,String>>();
        Map<String, String> columns = new HashMap<String, String>();
        columns.put("col_1","String");
        columns.put("col_2","number");
        columns.put("col_3","number");
        list.add(columns);

        System.out.println(columns);

        sqlServiceImpl.createTable(newTabelName,list);
    }
}
