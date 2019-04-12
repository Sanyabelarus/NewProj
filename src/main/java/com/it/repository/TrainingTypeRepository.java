package com.it.repository;

import com.it.model.TrainingType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository layer for TrainingTypes
 */
public interface TrainingTypeRepository extends JpaRepository<TrainingType, Integer> {
}
