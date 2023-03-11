import com.learning.spring6.bean.User;
import com.learning.spring6.config.SpringConfig;
import com.learning.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    /**
     * 下面的测试类是对全注解开发的一个测试
     */
    @Test
    void testAnnotatation(){
        // 加载配置类
        ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 以下的代码就与其它的测试类一样
        UserController userController = cxt.getBean(UserController.class);
        userController.add();
    }
}
