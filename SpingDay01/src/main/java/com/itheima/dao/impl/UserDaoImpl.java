package com.itheima.dao.impl;

import com.itheima.dao.UserDao;


import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List list;
    private Map<String,String> map;
    private Properties properties;

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    @Override
    public void save() {
        System.out.println(this.toString());
    }
}
