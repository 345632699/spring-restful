package com.resetful.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by xu on 2017/11/24.
 */
@Data
public class User {
    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }

}
