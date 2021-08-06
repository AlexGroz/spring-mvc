package com.javastart.springmvc.controller;

import com.javastart.springmvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public Long createAccount(){

    }
}
