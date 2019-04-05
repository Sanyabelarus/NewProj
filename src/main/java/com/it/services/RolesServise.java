package com.it.services;

import com.it.model.Roles;

import java.util.List;

public interface RolesServise {
    Roles addUser(Roles user);
    void delete(Integer num);
    Roles getByName(String name);
    List<Roles> getAll();
}
