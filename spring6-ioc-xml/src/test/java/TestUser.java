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
        User user = (User) cxt.getBean("user");
        user.run();
    }
}
