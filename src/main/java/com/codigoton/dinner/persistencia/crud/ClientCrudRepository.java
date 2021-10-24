package com.codigoton.dinner.persistencia.crud;

import com.codigoton.dinner.persistencia.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
    @Query(value = "SELECT * FROM client WHERE code = ?", nativeQuery = true)
    List<Client> findByCode(String code);
}

