package com.it.services.impl;

import com.it.model.Client;
import com.it.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
