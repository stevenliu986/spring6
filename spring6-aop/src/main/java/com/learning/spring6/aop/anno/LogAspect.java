package com.learning.spring6.aop.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClassName: LogAspect
 * Package: com.learning.spring6.aop.anno
 * Description: 切面类
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
@Aspect
@Component
public class LogAspect {

    // 设置切入点和通知类型
    // 通知类型：前置@Before，返回@AfterReturning，异常@AfterThrowing，后置@After，环绕@Around
    // 前置@Before(value = "切入点表达式配置切入点")
    @Before(value = "execution(public int com.learning.spring6.aop.anno.CalculatorImpl.add(..))")
    public void beforeMethod(){
        System.out.println("前置通知");
    }

    @After(value = "execution(public int com.learning.spring6.aop.anno.CalculatorImpl.add(..))")
    public void afterMethod(){
        System.out.println("后置通知");
    }

}
