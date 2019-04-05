package com.it.services;

import com.it.model.Trainer;

import java.util.List;

public interface TrainerService {
    Trainer addUser(Trainer user);
    void delete(Integer num);
    Trainer getByName(String name);
    List<Trainer> getAll();
}
