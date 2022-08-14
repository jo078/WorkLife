package com.springboot.springbootfirst.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootfirst.entity.Category;
import com.springboot.springbootfirst.repository.CategoryRepo;

@Service
public class CategoryServiceImpl
{
	@Autowired
	CategoryRepo catRepo;

	public void createCategory(Category reqCat)
	{
		System.out.println("Data creation started...itemRepo -" + reqCat);
		catRepo.save(reqCat);
		System.out.println("Data creation complete...");
	}
}
