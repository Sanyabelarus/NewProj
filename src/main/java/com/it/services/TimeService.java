package com.it.services;

import com.it.model.Time;

import java.util.List;

public interface TimeService {
    Time addUser(Time user);

    void delete(Integer num);

    List<Time> getAll();
}
