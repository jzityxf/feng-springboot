package com.feng.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.jdbc.dao.IAccountDAO;
import com.feng.jdbc.entity.Account;
import com.feng.jdbc.service.IAccountService;

/**

 */
@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountDAO accountDAO;
    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(Integer id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
