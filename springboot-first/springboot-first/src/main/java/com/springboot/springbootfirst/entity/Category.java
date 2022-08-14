package com.springboot.springbootfirst.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Category")
public class Category
{
	private String name;
	private String colour;

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

}
