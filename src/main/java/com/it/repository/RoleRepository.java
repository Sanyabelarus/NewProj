package com.it.repository;


import com.it.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository layer for Role
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
