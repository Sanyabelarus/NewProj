package com.it.repository;

import com.it.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

/** Repository layer for Times */
public interface Timeepository extends JpaRepository<Time, Integer> {}
