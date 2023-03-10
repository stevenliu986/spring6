package com.learning.spring6.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDaoImpl
 * Package: com.learning.spring6.dao
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/03/2023
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("Dao running......");
    }
}
