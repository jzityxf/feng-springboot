package com.feng.jdbc.dao;

import java.util.List;

import com.feng.jdbc.entity.Account;

/**

 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
