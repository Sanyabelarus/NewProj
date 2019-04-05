package com.it.services;

import com.it.model.Day;

import java.util.List;

public interface DayService {
    Day addUser(Day user);
    void delete(Integer num);
    List<Day> getAll();
}
