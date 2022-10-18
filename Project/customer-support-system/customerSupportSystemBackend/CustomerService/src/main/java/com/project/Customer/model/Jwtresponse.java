package com.project.Customer.model;

public class Jwtresponse {
    String token;

    public Jwtresponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
