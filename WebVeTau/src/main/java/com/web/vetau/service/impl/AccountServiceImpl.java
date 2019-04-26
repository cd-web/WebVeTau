package com.web.vetau.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.vetau.repository.AccountRepository;
import com.web.vetau.service.AccountService;

public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
}
