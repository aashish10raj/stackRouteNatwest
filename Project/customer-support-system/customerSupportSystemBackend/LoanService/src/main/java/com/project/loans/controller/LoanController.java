package com.project.loans.controller;

import com.project.loans.model.Loan;
import com.project.loans.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loan")
//@CrossOrigin("*")
public class LoanController {
    @Autowired
    private LoanService service;

    ResponseEntity response;

    boolean flag;
    @PostMapping("/addLoan")
    public Loan addLoan(@RequestBody Loan loan) throws Exception{
        return service.addLoan(loan);
    }

    @GetMapping("/loans")
    public ResponseEntity<?> getLoans(@RequestParam("customerId") String customerId){
        List<Loan> loanList = this.service.getCustomerLoans(customerId);

        if(loanList !=null) {
            response=new ResponseEntity<List<Loan>>(loanList, HttpStatus.OK);
        }else {
            response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
        }
        return response;
    }

}