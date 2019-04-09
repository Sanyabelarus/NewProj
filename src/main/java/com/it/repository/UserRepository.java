package com.it.repository;

import com.it.model.Client;
import com.it.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/** Repository layer for Users */
public interface UserRepository extends JpaRepository<User, Integer> {
  /**
   * Get user by name from DataBase
   *
   * @param name of user
   * @return user
   */
  User findByName(String name);
  /**
   * Find clients who have a club card
   *
   * @param haveclubcard client have a club card
   * @return List<User>
   */
  @Query("FROM Client client JOIN FETCH user.clients WHERE car.client.haveclubcard = TRUE")
  List<User> findClientsWithClubCards(@Param("haveclubcard") Boolean haveclubcard);
}
