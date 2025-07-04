package com.google.TaskManagement;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Task {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  private  String Title;
	  private LocalDate dueDate;
	  private String category;
	  private String priroty;
	  private String status;
	
}
