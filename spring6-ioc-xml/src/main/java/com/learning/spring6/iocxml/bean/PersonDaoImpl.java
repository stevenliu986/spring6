package com.learning.spring6.iocxml.bean;

/**
 * ClassName: PersonDao
 * Package: com.learning.spring6.iocxml.bean
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("Person running.....");
    }
}
