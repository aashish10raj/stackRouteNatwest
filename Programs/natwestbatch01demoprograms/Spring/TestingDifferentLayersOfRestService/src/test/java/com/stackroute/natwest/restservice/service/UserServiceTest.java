package com.stackroute.natwest.restservice.service;

import com.stackroute.natwest.restservice.model.User;
import com.stackroute.natwest.restservice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    private List<User> userList;
    @Test
    public void givenUserToSaveShouldReturnSavedUser() {
        User user = new User(1, "Peter", "T", 22);
        when(userRepository.save(any())).thenReturn(user);
        userService.saveUser(user);
        verify(userRepository, times(1)).save(any());
    }
     @Test
    public void givenGetAllUsersThenShouldReturnListOfAllUsers(){
        User user = new User(1, "John", "R", 21);
         User user1 = new User(2, "Sam", "T", 22);
        userRepository.save(user);
        userRepository.save(user1);
        // stubbing the mock to return specific data
        when(userRepository.findAll()).thenReturn(userList);
        userList= (List<User>) userRepository.findAll();
        verify(userRepository,times(1)).save(user);
        verify(userRepository, times(1)).findAll();
    }


}