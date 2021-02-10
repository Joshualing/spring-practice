package com.spring.Interface.impl;

import com.spring.Interface.UserDao;

public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        System.out.println("a+b:"+(a+b));
        return a+b;
    }

    public String update(String id) {
        System.out.println("id:"+id);
        return id;
    }
}
