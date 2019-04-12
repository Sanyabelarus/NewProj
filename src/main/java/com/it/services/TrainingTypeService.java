package com.it.services;

import com.it.model.TrainingType;

import java.util.List;

public interface TrainingTypeService {
    TrainingType addUser(TrainingType user);
    void delete(Integer num);
    TrainingType getByName(String name);
    List<TrainingType> getAll();
}
