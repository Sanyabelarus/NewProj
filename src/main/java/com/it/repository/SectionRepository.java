package com.it.repository;


import com.it.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository layer for Sections
 */
public interface SectionRepository extends JpaRepository<Section, Integer> {

}
