package com.it.services;

import com.it.model.DateTime;

import java.util.List;

public interface DateTimeService {
    DateTime addUser(DateTime user);

    void delete(Integer Id);

    List<DateTime> getAll();
}
