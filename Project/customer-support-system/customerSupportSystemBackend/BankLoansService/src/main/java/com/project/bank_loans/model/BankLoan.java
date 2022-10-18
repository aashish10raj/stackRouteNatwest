package com.project.bank_loans.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_loans")
public class BankLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String CreditGrade;
    private String AmountRange;
    private String Time;
    private String InterestRate;

    public BankLoan(){
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCreditGrade() {
        return CreditGrade;
    }

    public void setCreditGrade(String creditGrade) {
        CreditGrade = creditGrade;
    }

    public String getAmountRange() {
        return AmountRange;
    }

    public void setAmountRange(String amountRange) {
        AmountRange = amountRange;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(String interestRate) {
        InterestRate = interestRate;
    }
}
