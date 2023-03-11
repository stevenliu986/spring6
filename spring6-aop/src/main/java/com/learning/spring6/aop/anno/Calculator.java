package com.learning.spring6.aop.anno;

/**
 * ClassName: Calculator
 * Package: com.learning.spring6.aop.example
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
public interface Calculator {
    int add(int i , int j);
    int sub(int i, int j);
    int multiple(int i, int j);
    int devision(int i, int j) throws Exception;
}
