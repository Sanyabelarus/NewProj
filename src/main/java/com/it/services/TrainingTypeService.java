package com.it.services;

import com.it.model.TrainingTypes;

import java.util.List;

public interface TrainingTypesService {
    TrainingTypes addUser(TrainingTypes user);
    void delete(Integer num);
    TrainingTypes getByName(String name);
    List<TrainingTypes> getAll();
}
