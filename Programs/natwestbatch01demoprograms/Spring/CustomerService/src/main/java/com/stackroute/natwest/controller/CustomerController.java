package com.stackroute.natwest.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.natwest.model.Customer;
import com.stackroute.natwest.service.CustomerService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
	@Autowired
	private  CustomerService service;
	
	ResponseEntity response;
	String jwtToken;
	
	boolean flag;
	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		flag=service.addCustomer(customer);
		
		if(flag) {
			response=new ResponseEntity<String>("Customer Object Created", HttpStatus.CREATED);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping
	public ResponseEntity<?> getAllCustomer(){
		List<Customer> customerList=service.getAllCustomers();
		
		if(customerList !=null) {
			response=new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
    return response;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Customer customer, HttpSession session){
		flag=service.validate(customer);
		
		if(flag) {
			session.setAttribute("name", customer.getCustomerName());
			jwtToken=generateToken(customer.getCustomerName());
			response=new ResponseEntity<String>(jwtToken, HttpStatus.OK);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
		}
		return response;
	}
	
	@GetMapping("/logout")
	public ResponseEntity<?> logout(HttpSession session){
		
		if((session !=null) && (session.getAttribute("name") !=null)) {
			session.invalidate(); // Destroying the session
			response=new ResponseEntity<String>("Logged out successfuly", HttpStatus.OK);
		}else {
			response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
		}
		return response;
	}
	
	public String generateToken(String customerName) {
		String token=Jwts.builder()
				.setSubject(customerName)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+300000))
				.signWith(SignatureAlgorithm.HS256, "secretKey")
				.compact();
		System.out.println("Token "+token);
		return token;
				
		
	}

}
