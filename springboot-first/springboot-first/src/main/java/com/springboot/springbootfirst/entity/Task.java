package com.springboot.springbootfirst.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Task")
public class Task
{
	@Id
	private String taskId;
	private String description;
	private String date, startTime, endTime;

	@ManyToOne
	@JoinColumn(name = "name")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "username")
	private User user;

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public String getTaskId()
	{
		return taskId;
	}

	public void setTaskId(String taskId)
	{
		this.taskId = taskId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getEndTime()
	{
		return endTime;
	}

	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	public Task(String taskId, String description, String date, String startTime, String endTime)
	{
		super();
		this.taskId = taskId;
		this.description = description;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

}
