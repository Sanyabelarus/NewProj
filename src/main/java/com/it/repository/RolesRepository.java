package com.it.repository;

import com.it.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/** Repository layer for Roles */
public interface RolesRepository extends JpaRepository<Roles, Integer> {}
