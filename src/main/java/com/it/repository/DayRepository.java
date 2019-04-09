package com.it.repository;

import com.it.model.Day;
import org.springframework.data.jpa.repository.JpaRepository;

/** Repository layer for Days */
public interface DayRepository extends JpaRepository<Day, Integer> {}
