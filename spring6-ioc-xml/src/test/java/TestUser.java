import com.learning.spring6.iocxml.User;
import com.learning.spring6.iocxml.bean.UserDao;
import com.learning.spring6.iocxml.di.Book;
import com.learning.spring6.iocxml.di.Employee;
import com.learning.spring6.iocxml.di.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class TestUser {

    @Test
    void testUser01(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");

        // 根据id来获取bean
        User user01 = (User) cxt.getBean("user");
        user01.run();

        // 根据类型来获取bean
        User user02 = cxt.getBean(User.class);
        user02.run();

        // 根据id和类型来获取bean
        User user03 = cxt.getBean("user", User.class);
        user03.run();
    }

    @Test
    void testUserDao(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = cxt.getBean("userDao",UserDao.class);
        userDao.run();

        UserDao personDao = cxt.getBean("personDao", UserDao.class);
        personDao.run();
    }


    @Test
    void testBook(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book =cxt.getBean("book", Book.class);
        String bookName = book.getBname();
        String author = book.getAuthor();
        System.out.println(bookName + ":" + author);

        Book book1 = cxt.getBean("book1", Book.class);
        System.out.println(book1.getBname());
        System.out.println(book1.getAuthor());
    }

    @Test
    void testDeptEmp(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-di.xml");
        Employee emp = cxt.getBean("emp", Employee.class);
        emp.work();
    }

    @Test
    void testStudentAndLessonList(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-di-ref.xml");
        Student student = cxt.getBean(Student.class);
        student.run();
    }
}
