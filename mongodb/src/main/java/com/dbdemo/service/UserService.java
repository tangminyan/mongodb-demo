package com.dbdemo.service;

import com.dbdemo.entity.User;

import java.util.List;

/**
 * Created by tangminyan on 2018/12/20.
 */
public interface UserService {

    List<User> findAll();

    User getUser(Integer id);

    void insert(User user);
}
