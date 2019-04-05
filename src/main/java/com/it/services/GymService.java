package com.it.services;

import com.it.model.Gym;

import java.util.List;

public interface GymService {
    Gym addUser(Gym user);
    void delete(Integer num);
    List<Gym> getAll();
}
