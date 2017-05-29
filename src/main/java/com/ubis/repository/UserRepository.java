package com.ubis.repository;

import org.springframework.data.repository.CrudRepository;

import com.ubis.entity.Account;

public interface UserRepository extends CrudRepository<Account, String> {

}
