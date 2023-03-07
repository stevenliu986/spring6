import com.learning.spring6.User;
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
    void testUser(){
        // 加载sp;ring配置文件，对象创建
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) cxt.getBean("user");

        // 使用对象调用方法进行测试
        user.add();
    }
}
