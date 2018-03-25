package com.markos.liquibase.sqlfile.controller;

import com.markos.liquibase.sqlfile.entity.Task;
import com.markos.liquibase.sqlfile.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/{id}")
	private Task findTask(@PathVariable long id) {
		return taskService.findTask(id);
	}

	@PostMapping
	private Task saveTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
}
