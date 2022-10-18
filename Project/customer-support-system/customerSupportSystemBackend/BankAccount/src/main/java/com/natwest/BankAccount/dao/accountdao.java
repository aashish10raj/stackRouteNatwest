package com.natwest.BankAccount.dao;

import com.natwest.BankAccount.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accountdao extends JpaRepository<BankAccount,Long> {
    List<BankAccount> findBycustomerId(String customerId);
}
