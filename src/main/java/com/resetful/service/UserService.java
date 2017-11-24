package com.resetful.service;

import com.resetful.model.User;

import java.util.List;

/**
 * Created by xu on 2017/11/24.
 */
public interface UserService {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);
}
