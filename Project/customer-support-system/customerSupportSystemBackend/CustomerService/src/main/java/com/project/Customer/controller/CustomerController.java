package com.project.Customer.controller;

import com.project.Customer.helper.CustomerNotFoundException;
import com.project.Customer.model.Customer;
import com.project.Customer.model.Jwtresponse;
import com.project.Customer.services.CustomerService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customerservice")
//@CrossOrigin("*")
public class CustomerController {
    @Autowired
    private CustomerService service;
    String jwtToken;
    ResponseEntity response;

    boolean flag;
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) throws Exception{
        return service.addCustomer(customer);
    }
//    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) throws Exception{
//
        //        flag=service.addCustomer(customer);
//
//        if(flag) {
//            response=new ResponseEntity<String>("Customer Object Created", HttpStatus.CREATED);
//        }else {
//            response=new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
//        }
//        return response;
//    }
//    @GetMapping("/getcustomer")
//    public Customer getCustomer(@RequestParam("customerId") String customerId){
//        return service.getCustomer(customerId);
//    }
    @GetMapping("/getcustomer")
    public ResponseEntity<?> getCustomer(@RequestParam("customerId") String customerId){
        Customer c=service.getCustomer(customerId);
        return ResponseEntity.ok(new Customer(c.getId(),c.getCustomerId(),c.getName(),
                                    c.getMobileno(),c.getEmail(),c.getAge(),c.getEmp_type(),c.getPassword(),
                                    c.getCreditrating(), c.getProduct()));
        //return ResponseEntity.ok(c);
    }
    @GetMapping("/customers")
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
            session.setAttribute("customerId", customer.getCustomerId());
            jwtToken=generateToken(customer.getCustomerId());
            response=new ResponseEntity<String>(jwtToken, HttpStatus.OK);
            String token=jwtToken;
            return ResponseEntity.ok(new Jwtresponse(token));
            //response=new ResponseEntity<String>("Loged in", HttpStatus.OK);
        }else {
            //response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
            response=new ResponseEntity<>(new CustomerNotFoundException(), HttpStatus.CONFLICT);
        }
        return response;
    }
//    @PostMapping("/login")
//    public String login(@RequestBody Customer customer, HttpSession session){
//        flag=service.validate(customer);
//        String token;
//        if(flag) {
//            session.setAttribute("customerId", customer.getCustomerId());
//            jwtToken=generateToken(customer.getCustomerId());
//            token=jwtToken;
//            //response=new ResponseEntity<String>(jwtToken, HttpStatus.OK);
//            //response=new ResponseEntity<String>("Loged in", HttpStatus.OK);
//        }else {
//            //response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
//            token="Failure";
//        }
//        return token;
//    }

    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session){

        if((session !=null) && (session.getAttribute("customerId") !=null)) {
            session.invalidate(); // Destroying the session
            response=new ResponseEntity<String>("Logged out successfuly", HttpStatus.OK);
        }else {
            response=new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
        }
        return response;
    }
    public String generateToken(String customerName) {
        String token= Jwts.builder()
                .setSubject(customerName)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+2000000))
                .signWith(SignatureAlgorithm.HS256, "secretKey")
                .compact();
        System.out.println("Token "+token);
        return token;
    }


}
