package com.google.TaskManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class Task_Controller {
	@Autowired
	Task_Service taskService;

	 @PostMapping("/save")
	  public ResponseEntity<?> saveTask (@RequestBody Task t) {
		return taskService.saveTask(t);
	}
	 
	
	 
	}
	 
	 

