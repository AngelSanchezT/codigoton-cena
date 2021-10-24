package com.codigoton.dinner.persistencia.crud;

import com.codigoton.dinner.persistencia.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountCrudRepository extends CrudRepository<Account, Integer> {

}
