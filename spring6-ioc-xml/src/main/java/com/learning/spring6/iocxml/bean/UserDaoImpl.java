package com.learning.spring6.iocxml.bean;

/**
 * ClassName: UserDaoImpl
 * Package: com.learning.spring6.iocxml.bean
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void run() {
        System.out.println("User Running ......");
    }
}
