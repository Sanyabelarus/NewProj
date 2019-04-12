package com.it.repository;

import com.it.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository layer for Users
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Get user by name from DataBase
     *
     * @param name of user
     * @return user
     */
    User findByName(String name);
}
