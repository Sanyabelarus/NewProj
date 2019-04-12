package com.it.repository;

import com.it.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository layer for Clients
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
