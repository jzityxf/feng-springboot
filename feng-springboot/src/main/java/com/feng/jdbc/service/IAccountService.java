package com.feng.jdbc.service;

import java.util.List;

import com.feng.jdbc.entity.Account;

/**

 */
public interface IAccountService {


    int add(Account account);

    int update(Account account);

    int delete(Integer id);

    Account findAccountById(Integer id);

    List<Account> findAccountList();

}
