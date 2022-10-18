package com.natwest.BankAccount.service;

import com.natwest.BankAccount.dao.accountdao;
import com.natwest.BankAccount.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class accountservice {
    @Autowired
    accountdao dao;
    public List<BankAccount> getAccount(String customerId){
        return dao.findBycustomerId(customerId);
    }
    public BankAccount addBankAccount(BankAccount acc){
        return this.dao.save(acc);
    }
}
