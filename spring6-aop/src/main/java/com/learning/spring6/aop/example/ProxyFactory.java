package com.learning.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyFactory
 * Package: com.learning.spring6.aop.example
 * Description: 动态代理的实现
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * Proxy.newProxyInstance()方法有三个参数
     * 第一个参数：ClassLoader - 加载动态生成代理类的类加载器
     * 第二个参数：Class[] interfaces - 目录对象实现的所有接口的class类型数组
     * 第三个参数：InvocationHandler：设置代理对象实现目标对象方法的过程
     * @return 动态代理对象的实例
     */
    public Object getProxy(){

        // 第一个参数：ClassLoader
        ClassLoader classLoader = target.getClass().getClassLoader();

        // 第二个参数：Class[] interfaces
        Class<?>[] interfaces = target.getClass().getInterfaces();

        // 第三个参数：InvocationHandler：可以另外写个类或使用内部匿名类，
        // 这个是使用内部匿名类
        InvocationHandler invocationHandler = new InvocationHandler() {
            // 第一个参数：代理对象
            // 第二个参数：需要重写目标对象的方法
            // 第三个参数：method方法里面的参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("这里写日志");
                // 调用目标方法
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println("这里写日志");
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
