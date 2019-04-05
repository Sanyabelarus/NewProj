package com.it.services;

import com.it.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    void delete(Integer num);
    List<User> getAll();
}
