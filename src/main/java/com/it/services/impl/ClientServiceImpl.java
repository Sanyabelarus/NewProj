package com.it.services.impl;

import com.it.model.Client;
import com.it.services.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    @Override
    public Client addUser(Client user) {
        return user;
    }

    @Override
    public void delete(Integer num) {

    }

    @Override
    public Client getByName(String name) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }
}
