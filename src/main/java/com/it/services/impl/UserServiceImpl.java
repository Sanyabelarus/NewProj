package com.it.services.impl;

import com.it.model.User;
import com.it.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User addUser(User user) {
        return user;
    }

    @Override
    public void delete(Integer num) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
