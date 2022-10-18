package com.stackroute.natwest.restservice.repository;

import com.stackroute.natwest.restservice.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void givenUserToSaveShouldReturnSavedUser(){
        User user=new User(1,"Amish","Bharthi",22);
        userRepository.save(user);
        User user1=userRepository.findById((user.getId())).get();
        assertNotNull(user1);
        assertEquals(user1.getFirstName(),user.getFirstName());
    }
    @Test
    public void givenGetAllUsersThenShouldReturnListOfAllUsers(){
        User user=new User(1,"Amish","Bharthi",22);
        User user1=new User(2,"Amal","N",21);

        userRepository.save(user);
        userRepository.save(user1);

        List<User> userList= (List<User>) userRepository.findAll();
        assertEquals("Amal",userList.get(1).getFirstName());
    }


}