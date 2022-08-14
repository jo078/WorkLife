package com.springboot.springbootfirst.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootfirst.entity.Task;
import com.springboot.springbootfirst.repository.TaskRepo;

@Service

public class TaskServiceImpl
{
	@Autowired
	TaskRepo taskRepo;

	public String createTask(Task task)
	{
		System.out.println("In proces of data creation...");
		taskRepo.save(task);
		return "Record created";
	}

}
