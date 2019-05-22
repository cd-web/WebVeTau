package com.web.vetau.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.vetau.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
