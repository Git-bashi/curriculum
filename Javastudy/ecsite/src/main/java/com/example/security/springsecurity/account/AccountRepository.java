package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account findByUsername(String username);
    public List<Account> findAll();
}