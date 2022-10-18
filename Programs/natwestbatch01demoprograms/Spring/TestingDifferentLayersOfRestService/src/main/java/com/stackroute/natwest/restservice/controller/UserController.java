package com.stackroute.natwest.restservice.controller;

import com.stackroute.natwest.restservice.model.User;
import com.stackroute.natwest.restservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    private UserService service;
     @Autowired
    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
         User savedUser=service.saveUser(user);
         return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
      List<User> savedUser;
      return  new ResponseEntity<List<User>>(service.getAllUsers(), HttpStatus.OK);
    }
}
