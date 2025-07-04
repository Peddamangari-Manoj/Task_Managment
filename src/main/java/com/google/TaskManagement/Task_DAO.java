package com.google.TaskManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Task_DAO {
@Autowired
Task_Repository taskrepository;
 public  Task saveTask(Task t) {
	 return taskrepository.save(t);
	
}
}
