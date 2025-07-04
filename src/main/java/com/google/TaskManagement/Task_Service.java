package com.google.TaskManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;



@Service
public class Task_Service {
 @Autowired
 Task_DAO taskdao;
 
 public ResponseEntity<?> saveTask (@RequestBody Task t) {
	 Task savedTask= taskdao.saveTask(t);
		return ResponseEntity.status(201).body(savedTask);
	}
}
