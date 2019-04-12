package com.it.repository;


import com.it.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository layer for Trainers
 */
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

}
