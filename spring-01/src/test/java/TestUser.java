import com.learning.spring6.User;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    void testUser01(){
        // 加载sp;ring配置文件，对象创建
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) cxt.getBean("user");

        // 使用对象调用方法进行测试
        user.add();

        // 手动写入日志
        logger.info("调用执行成功。 ");
    }

    /**
     * 利用反射机制创建对象
     */
    @Test
    void testUser02() throws Exception {
        Class clazz = Class.forName("com.learning.spring6.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
