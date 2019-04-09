package com.it.repository;

import com.it.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/** Repository layer for Clients */
public interface ClientRepository extends JpaRepository<Client, Integer> {
  /**
   * Find all Clients from database
   *
   * @return List<Client>
   */
  List<Client> findAll();
}
