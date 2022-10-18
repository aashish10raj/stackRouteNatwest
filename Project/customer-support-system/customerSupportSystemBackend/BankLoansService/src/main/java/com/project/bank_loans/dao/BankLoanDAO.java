package com.project.bank_loans.dao;

import com.project.bank_loans.model.BankLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankLoanDAO extends JpaRepository<BankLoan, Long> {
    @Query(value = "SELECT * FROM bank_loans where Credit_Grade=?1 AND Amount_Range=?2 ", nativeQuery = true)
    List<BankLoan> getLoanByCreditGradeAndAmtRange(String Credit_Grade, String Amount_Range);
}





