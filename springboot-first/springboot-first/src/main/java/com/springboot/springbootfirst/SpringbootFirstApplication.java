package com.springboot.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootfirst.entity.User;
import com.springboot.springbootfirst.repository.ItemRepository;
import com.springboot.springbootfirst.services.UserServiceImpl;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
@RestController
@EnableMongoRepositories
public class SpringbootFirstApplication 
{
	@Autowired ItemRepository itemRepo;
	public static void main(String[] args) {
		//hello
		SpringApplication.run(SpringbootFirstApplication.class, args);
		System.out.println("In main...");
		//UserServiceImpl obj = new UserServiceImpl();
		//obj.createUser();
		//String lol = hello("hello");
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
	//return String.format("Hello %s!", name);
		System.out.println("Data creation started.. -");
		//itemRepo.save(new User("ramji", "sitaji", "siyaram@gmail.com"));
		UserServiceImpl obj = new UserServiceImpl();
		obj.createUser(itemRepo);
		System.out.println("Data creation complete...");
		return "hello";
	}

}
