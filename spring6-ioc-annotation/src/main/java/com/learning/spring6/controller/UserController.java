package com.learning.spring6.controller;

import com.learning.spring6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.learning.spring6.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/03/2023
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void add(){
        System.out.println("Controller running...");
        userService.add();
    }
}
