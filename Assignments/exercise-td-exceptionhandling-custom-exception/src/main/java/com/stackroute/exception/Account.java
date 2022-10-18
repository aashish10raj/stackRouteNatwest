package com.stackroute.exception;

public class Account {
    /**
     * accountBalance
     */
    private Integer accountBalance;
    /**
     * default constructor
     */
    public Account() {
        this.accountBalance = 0;
    }

    public Account(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public double withdraw(Integer withdrawAmount) throws NegativeIntegerException, InsufficientFundException {

        if(withdrawAmount<0) {
            throw new NegativeIntegerException("Withdrawing amount less than zero");
        }else if(withdrawAmount > accountBalance){
            throw new InsufficientFundException("Withdrawing amount greater than balance");
        }else {
            this.accountBalance = accountBalance - withdrawAmount;
        }
        return accountBalance;
    }

}