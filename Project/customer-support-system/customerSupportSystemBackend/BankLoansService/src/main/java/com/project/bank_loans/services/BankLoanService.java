package com.project.bank_loans.services;

import com.project.bank_loans.dao.BankLoanDAO;
import com.project.bank_loans.model.BankLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankLoanService {
    @Autowired
    BankLoanDAO dao;

    public BankLoan addLoan(BankLoan c) throws Exception {
        return null;
    }
    public List<BankLoan> getLoans(String customerId, Double loan_amount,int creditrating){
        //calculat customer credit rating
        //int credit = (int)(Math.random()*(900-300+1)+300);
        int credit=creditrating;
        //int credit=600;
        String band="";
        if(credit>=300 && credit<=450){
            band="D";
        }
        else if(credit>=450 && credit<=600){
            band="C";
        }
        else if(credit>=600 && credit<=750){
            band="B";
        }
        else{
            band="A";
        }

        String amt_range="1";
        if (loan_amount>=1000 && loan_amount<=10000)
            amt_range="1";
        else if (loan_amount>10000 && loan_amount<=100000)
            amt_range="2";
        else if (loan_amount>100000 && loan_amount<=2000000)
            amt_range="3";
        else if (loan_amount>2000000 && loan_amount<=10000000)
            amt_range="4";
        else
            amt_range="5";

        return this.dao.getLoanByCreditGradeAndAmtRange(band, amt_range);
    }
}
