package com.project.Customer.model;

import javax.persistence.*;

@Entity
@Table(name = "Bank_Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerId;
    private String name;
    private String mobileno;
    private String email;
    private int age;
    private String emp_type;
    private String password;   
    private String product;
    private int creditrating;
    
    public Customer(){

    }

    public int getCreditrating() {
        return creditrating;
    }

    public void setCreditrating(int creditrating) {
        this.creditrating = creditrating;
    }

   

    public Customer(Long id, String customerId, String name, String mobileno, String email, int age, String emp_type, String password,
            int creditrating, String product) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
        this.mobileno = mobileno;
        this.email = email;
        this.age = age;
        this.emp_type = emp_type;
        this.password = password;
        this.creditrating=creditrating;
        this.product=product;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct_type(String product) {
        this.product = product;
    }
    
}
