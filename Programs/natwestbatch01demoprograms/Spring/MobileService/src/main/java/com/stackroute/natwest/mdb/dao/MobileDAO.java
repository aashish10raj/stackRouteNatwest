package com.stackroute.natwest.mdb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.natwest.mdb.model.Mobile;

@Repository
public interface MobileDAO extends MongoRepository<Mobile, Integer> {

}
