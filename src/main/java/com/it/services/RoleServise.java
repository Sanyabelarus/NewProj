package com.it.services;

import com.it.model.Role;

import java.util.List;

public interface RoleServise {
    Role addRole(Role role);

    Role addRole(String name);

    Role setRoleName(String name);

    void delete(Integer num);

    Role getByName(String name);

    List<Role> getAll();
}
