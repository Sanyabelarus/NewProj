package com.it.services.impl;

import com.it.model.Role;
import com.it.repository.RoleRepository;
import com.it.services.RoleServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleServise {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role addRole(Role role) {
    Role addRole = roleRepository.save(role);
        return addRole;
    }
    @Override
    public  Role addRole(String name) {
        Role savedRole = new Role();
        savedRole.setRoleName(name);
        roleRepository.saveAndFlush(savedRole);
        return savedRole;
    }

    @Override
    public Role setRoleName(String name) {
        return null;
    }

    @Override
    public void delete(Integer num) {

    }

    @Override
    public Role getByName(String name) {
        return null;
    }

    @Override
    public List<Role> getAll() {
        return null;
    }
}
