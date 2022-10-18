package com.project.creditcards.services;

import com.project.creditcards.dao.CreditCardApplicationsDAO;
import com.project.creditcards.model.CreditCardApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardApplicationsDAO dao;

    public CreditCardApplication addCard(CreditCardApplication c) throws Exception {
        return this.dao.save(c);
    }
    public List<CreditCardApplication> getCustomerCardApplications(String customerId) {
        List<CreditCardApplication> cardList = this.dao.findAllByCustomerId(customerId);
        return cardList;
    }
}
