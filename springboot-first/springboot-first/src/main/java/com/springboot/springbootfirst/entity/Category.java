package com.springboot.springbootfirst.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Category")
public class Category
{
	private String name;
	private String colour;

	@ManyToOne
	@JoinColumn(name = "username")
	private User user;

	public Category(String name, String colour)
	{
		super();
		this.name = name;
		this.colour = colour;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getColour()
	{
		return colour;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

}
