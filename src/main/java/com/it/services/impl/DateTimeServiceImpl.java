package com.it.services.impl;

import com.it.model.DateTime;
import com.it.repository.DateTimeRepository;
import com.it.services.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    private DateTimeRepository dateTimeRepository;

    @Override
    public DateTime addUser(DateTime user) {
        DateTime dateTime = dateTimeRepository.save(user);
        return dateTime;
    }

    @Override
    public void delete(Integer Id) {
        dateTimeRepository.deleteById(Id);
    }

    @Override
    public List<DateTime> getAll() {
        return null;
    }
}
