package com.dbdemo.dao;

import com.dbdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tangminyan on 2018/12/20.
 */
public interface UserDao extends JpaRepository<User, String> {
    User findById(Integer id);
}
