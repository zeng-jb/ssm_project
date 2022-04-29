import com.zeng.pojo.Student;
import com.zeng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    /*
Student{
    name='曾嘉彬',
    address=Address{address='null'},
    book=[红楼梦, 西游记, 水浒传, 三国演义],
    hobbies=[听歌, 看电影, 敲代码],
    card={身份证=111221212121221, 银行卡=458756348754344},
    games=[LOL, CSGO, DOTA],
    wife='null',
    info={password=123456, url=男, driver=20182022, username=root}

   }

Student{
     name='曾嘉彬',
     address=Address{address='广州'},
     book=[红楼梦, 西游记, 水浒传, 三国演义],
     hobbies=[听歌, 看电影, 敲代码],
     card={
         身份证=111221212121221,
         银行卡=458756348754344
         },
     games=[LOL, CSGO, DOTA],
     wife='null',
     info={
         password=123456,
         url=男,
         driver=20182022,
         username=root
         }
     }
     */

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user==user2);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }
}
