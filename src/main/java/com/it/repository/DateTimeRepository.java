package com.it.repository;

import com.it.model.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;

/** Repository layer DataTimes */
public interface DateTimeRepository extends JpaRepository<DateTime, Integer> {}
