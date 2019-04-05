package com.it.services;

import com.it.model.Client;

import java.util.List;

public interface ClientService {
    Client addUser(Client user);
    void delete(Integer num);
    Client getByName(String name);
    List<Client> getAll();
}
