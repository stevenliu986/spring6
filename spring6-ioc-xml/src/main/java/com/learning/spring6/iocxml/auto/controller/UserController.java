package com.learning.spring6.iocxml.auto.controller;

import com.learning.spring6.iocxml.auto.dao.UserDao;
import com.learning.spring6.iocxml.auto.service.UserService;

/**
 * ClassName: UserController
 * Package: com.learning.spring6.iocxml.auto.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/03/2023
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
    System.out.println("add userController.......");
    userService.addUserService();
}
}
