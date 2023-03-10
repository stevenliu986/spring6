import com.learning.spring6.bean.User;
import com.learning.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestAnnotation
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/03/2023
 */
public class TestAnnotation {
    @Test
    void testUser(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        User user = cxt.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    void testController(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = cxt.getBean(UserController.class);
        userController.add();
    }
}
