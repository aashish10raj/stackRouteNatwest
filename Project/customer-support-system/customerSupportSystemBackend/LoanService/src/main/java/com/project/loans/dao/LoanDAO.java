package com.project.loans.dao;

import com.project.loans.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDAO extends JpaRepository<Loan, Long> {

    public Loan findByLoanId(Long loanId);

    @Query(value = "SELECT * FROM Loans where customer_id=?1", nativeQuery = true)
    public List<Loan> findAllByCustomerId(String customerId);
}





