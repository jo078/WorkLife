package com.springboot.springbootfirst.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.springbootfirst.entity.Task;

public interface TaskRepo extends MongoRepository<Task, String>
{

}
