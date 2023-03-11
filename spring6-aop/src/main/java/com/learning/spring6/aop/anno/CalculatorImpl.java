package com.learning.spring6.aop.anno;

import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorImpl
 * Package: com.learning.spring6.aop.example
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        return i - j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }

    @Override
    public int devision(int i, int j) throws Exception {
        if (j == 0) {
            throw new Exception("error.");
        }
        return i / j;
    }
}
