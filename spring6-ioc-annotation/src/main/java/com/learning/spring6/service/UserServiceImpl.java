package com.learning.spring6.service;

import com.learning.spring6.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.learning.spring6.service
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/03/2023
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service running......");
        userDao.add();
    }
}
