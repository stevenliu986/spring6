package com.learning.spring6.aop.example;

/**
 * ClassName: CalculatorStaticProxy
 * Package: com.learning.spring6.aop.example
 * Description: 静态代理
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
public class CalculatorStaticProxy implements Calculator{

    // 被代理目标对象传递进来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("add start......");
        int result = calculator.add(i,j);
        System.out.println("add finish......");
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int multiple(int i, int j) {
        return 0;
    }

    @Override
    public int devision(int i, int j) throws Exception {
        return 0;
    }
}
