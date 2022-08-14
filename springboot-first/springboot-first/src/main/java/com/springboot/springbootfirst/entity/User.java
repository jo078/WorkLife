package com.springboot.springbootfirst.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User 
{
	private String username;
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	private String password;
	public String getPassword() 
	{
		return password;
	}
	public User(String username, String password, String email) 
	{
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	private String email;
}
