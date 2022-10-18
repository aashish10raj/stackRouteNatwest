package com.project.loans.services;

import com.project.loans.dao.LoanDAO;
import com.project.loans.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    @Autowired
    LoanDAO dao;

    public Loan addLoan(Loan l) throws Exception {
        return this.dao.save(l);
    }
    public List<Loan> getCustomerLoans(String customerId) {
        List<Loan> loanList = this.dao.findAllByCustomerId(customerId);
        return loanList;
    }
}
