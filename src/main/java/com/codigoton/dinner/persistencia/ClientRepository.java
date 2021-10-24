package com.codigoton.dinner.persistencia;

import com.codigoton.dinner.persistencia.crud.ClientCrudRepository;
import com.codigoton.dinner.persistencia.entity.Client;

import java.util.List;

public class ClientRepository {

    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }

    public List<Client> getByCode(String code) {
        return clientCrudRepository.findByCode(code);
    }
}
