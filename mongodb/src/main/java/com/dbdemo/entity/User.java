package com.dbdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by tangminyan on 2018/12/20.
 */
@AllArgsConstructor
@Setter
@Getter
public class User implements Serializable {

    @Id
    private String _id;
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "User [_id=" + _id + ", id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
