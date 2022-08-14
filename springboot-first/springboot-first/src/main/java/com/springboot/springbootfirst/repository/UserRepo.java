package com.springboot.springbootfirst.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootfirst.entity.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
    public long count();
}
