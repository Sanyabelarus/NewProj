package com.it.repository;

import com.it.model.Client;
import com.it.model.DateTime;
import com.it.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Timeepository extends JpaRepository<Time, Integer> {

}
