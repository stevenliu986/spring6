import com.learning.spring6.iocxml.User;
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
}
