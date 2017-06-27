package com.feng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.dao.IAccountDAO;
import com.feng.entity.Account;
import com.feng.service.IAccountService;

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
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
