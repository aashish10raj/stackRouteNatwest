package com.stackroute;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private StringBuilder name;

    public User(){

    }

    public User(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Bean
    public StringBuilder name() {
        StringBuilder name = new StringBuilder("Aashish Raj");
        return name;
    }
}
