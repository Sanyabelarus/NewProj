package com.it.repository;

import com.it.model.Client;
import com.it.model.TrainingTypes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrainingTypesRepository extends JpaRepository<TrainingTypes, Integer> {
}
