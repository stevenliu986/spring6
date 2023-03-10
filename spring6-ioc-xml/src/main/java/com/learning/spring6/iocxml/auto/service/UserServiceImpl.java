package com.learning.spring6.iocxml.auto.service;

import com.learning.spring6.iocxml.auto.dao.UserDao;

/**
 * ClassName: UserServiceImpl
 * Package: com.learning.spring6.iocxml.auto.service
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/03/2023
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("add userService......");
        userDao.addUserDao();
    }
}
