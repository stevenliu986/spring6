import com.learning.spring6.aop.example.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * ClassName: TestDynamicProxy
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
public class TestDynamicProxy {

    @Test
    void testProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
