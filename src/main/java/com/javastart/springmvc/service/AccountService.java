package com.javastart.springmvc.service;

import com.javastart.springmvc.entity.Account;
import com.javastart.springmvc.repository.AccountRepository;

import java.util.Optional;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long saveAccount(String name, String email){
        return accountRepository.save(new Account(name, email)).getAccountId();
    }

    public Optional findAccountById(Long accountId) {
        return accountRepository.findById(accountId);
    }

}
