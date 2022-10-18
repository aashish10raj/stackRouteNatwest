package com.natwest.learning.data;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private String address;
    private Date date;

    public Person() {
    }

    public Person(String name, int age, String address, Date date) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


