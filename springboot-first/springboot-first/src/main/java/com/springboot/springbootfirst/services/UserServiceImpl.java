package com.springboot.springbootfirst.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootfirst.entity.User;
import com.springboot.springbootfirst.repository.ItemRepository;

@Service
public class UserServiceImpl 
{
	//@Autowired ItemRepository itemRepo;
	public void createUser(User reqUser, ItemRepository itemRepo) 
	{
		System.out.println("Data creation started...itemRepo -" + reqUser);
		itemRepo.save(reqUser);
        System.out.println("Data creation complete...");
	}
}


