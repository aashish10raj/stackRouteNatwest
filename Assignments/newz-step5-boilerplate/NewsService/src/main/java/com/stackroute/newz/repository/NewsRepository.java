package com.stackroute.newz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.newz.model.UserNews;


@Repository
public interface NewsRepository extends MongoRepository<UserNews, String> {

}
