package com.natwest.BankAccount.model;

import javax.persistence.*;

@Entity
@Table(name = "Account_details")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String customerId;
    private String accNo;
    private String accType;
    private String balance;

    public BankAccount( String customerId, String accNo, String accType, String balance) {

        this.customerId = customerId;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
