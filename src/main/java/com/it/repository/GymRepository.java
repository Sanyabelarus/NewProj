package com.it.repository;

import com.it.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/** Repository layer for Gyms */
public interface GymRepository extends JpaRepository<Gym, Integer> {}
