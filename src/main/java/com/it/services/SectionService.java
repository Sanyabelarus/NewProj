package com.it.services;

import com.it.model.Section;

import java.util.List;

public interface SectionService {
    Section addUser(Section user);
    void delete(Integer num);
    Section getByName(String name);
    List<Section> getAll();
}
