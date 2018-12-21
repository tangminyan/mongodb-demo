package com.dbdemo.service.impl;

import com.dbdemo.dao.UserDao;
import com.dbdemo.entity.User;
import com.dbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tangminyan on 2018/12/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User getUser(Integer id){
        return userDao.findById(id);
    }

    @Override
    public void insert(User user) {
        userDao.save(user);
    }
}
