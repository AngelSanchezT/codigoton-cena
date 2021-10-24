package com.codigoton.dinner.persistencia;

import com.codigoton.dinner.persistencia.crud.AccountCrudRepository;
import com.codigoton.dinner.persistencia.entity.Account;

import java.util.List;

public class AccountRepository {

    private AccountCrudRepository accountCrudRepository;

    public List<Account> getAll() {
        return (List<Account>) accountCrudRepository.findAll();
    }
}
