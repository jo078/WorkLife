package com.springboot.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootfirst.entity.Category;
import com.springboot.springbootfirst.entity.User;
import com.springboot.springbootfirst.repository.UserRepo;
import com.springboot.springbootfirst.services.CategoryServiceImpl;
import com.springboot.springbootfirst.services.UserServiceImpl;

@SpringBootApplication(exclude =
{ DataSourceAutoConfiguration.class })
@RestController
@EnableMongoRepositories
public class SpringbootFirstApplication
{
	@Autowired
	UserRepo itemRepo;
	@Autowired
	CategoryServiceImpl catServImpl;

	public static void main(String[] args)
	{
		// hello
		SpringApplication.run(SpringbootFirstApplication.class, args);
		System.out.println("In main...");
		// UserServiceImpl obj = new UserServiceImpl();
		// obj.createUser();
		// String lol = hello("hello");
	}

	@ResponseBody
	@PostMapping(path = "/user", consumes = "application/json", produces = "application/json")
	public String hello(RequestEntity<User> requestEntity)
	{
		System.out.println("Data creation started.. -");

		System.out.println("request body : " + requestEntity.getBody());
		User reqBody = requestEntity.getBody();

		UserServiceImpl obj = new UserServiceImpl();
		obj.createUser(reqBody, itemRepo);

		System.out.println("Data creation complete...");
		return "hello";
	}

	// @ResponseBody
	@PostMapping(path = "/category", consumes = "application/json", produces = "application/json")
	public String createCategory(RequestEntity<Category> requestEntity)
	{
		System.out.println("Data creation started.. -");

		System.out.println("request body : " + requestEntity.getBody());
		Category reqBody = requestEntity.getBody();

		// CategoryServiceImpl obj = new CategoryServiceImpl();
		catServImpl.createCategory(reqBody);

		System.out.println("Data creation complete...");
		return "hello";
	}

}
