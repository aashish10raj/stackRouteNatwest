package com.stackroute.natwest.restservice.service;

import com.stackroute.natwest.restservice.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
}
