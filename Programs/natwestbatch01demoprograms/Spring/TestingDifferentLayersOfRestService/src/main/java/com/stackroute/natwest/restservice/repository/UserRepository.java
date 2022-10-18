package com.stackroute.natwest.restservice.repository;

import com.stackroute.natwest.restservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
