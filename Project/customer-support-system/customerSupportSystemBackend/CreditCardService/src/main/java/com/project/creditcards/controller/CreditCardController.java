package com.project.creditcards.controller;

import com.project.creditcards.model.CreditCardApplication;
import com.project.creditcards.services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/creditcard")
//@CrossOrigin("*")
public class CreditCardController {
    @Autowired
    private CreditCardService service;

    ResponseEntity response;

    boolean flag;
    @PostMapping("/addCard")
    public CreditCardApplication addCard(@RequestBody CreditCardApplication card) throws Exception{
        return service.addCard(card);
    }

    @GetMapping("/cards")
    public ResponseEntity<?> getCards(@RequestParam("customerId") String customerId){
        List<CreditCardApplication> cardList = this.service.getCustomerCardApplications(customerId);

        if(cardList !=null) {
            response=new ResponseEntity<List<CreditCardApplication>>(cardList, HttpStatus.OK);
        }else {
            response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
        }
        return response;
    }

}