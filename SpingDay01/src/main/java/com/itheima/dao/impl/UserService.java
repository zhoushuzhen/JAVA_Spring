package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

import java.util.Arrays;

public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();
    }
}
