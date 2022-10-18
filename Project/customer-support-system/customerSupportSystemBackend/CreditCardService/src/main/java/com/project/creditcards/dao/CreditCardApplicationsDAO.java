package com.project.creditcards.dao;

import com.project.creditcards.model.CreditCardApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardApplicationsDAO extends JpaRepository<CreditCardApplication, Long> {

//    public CreditCardApplication findByLoanId(Long loanId);

    @Query(value = "SELECT * FROM Card_applications where customer_id=?1", nativeQuery = true)
    public List<CreditCardApplication> findAllByCustomerId(String customerId);
}





