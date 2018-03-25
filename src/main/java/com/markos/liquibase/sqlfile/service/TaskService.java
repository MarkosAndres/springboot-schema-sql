package com.markos.liquibase.sqlfile.service;

import com.markos.liquibase.sqlfile.entity.Task;
import com.markos.liquibase.sqlfile.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Task findTask(long id) {
		return taskRepository.findOne(id);
	}

	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
}
