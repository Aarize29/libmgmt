package com.aarize.libmgmt.libmgmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.aarize.libmgmt.libmgmt.entity.Student;
import com.aarize.libmgmt.libmgmt.services.IStudentService;
import com.aarize.libmgmt.libmgmt.services.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	public StudentController() {
		this.studentService=new StudentService();
	}
	
	/*
	 	GETTING ALL STUDENTS
	 */
	@GetMapping(path="/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	
	/*
	 	GETTING ONE STUDENT AT A TIME BY THE HELP OF THEIR ROLL NUMBER
	 */
	@GetMapping(path="/getStudentById/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
		
		
		return ResponseEntity.ok(studentService.getStudentById(id));
	}
	
	
	/*
	 	 ADDING STUDENTS 
	 */
	@PostMapping(path="/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student std=new Student();
		
		 System.out.println("Received student: " + student);
		 
		std = studentService.addStudent(student);
		
		
		return ResponseEntity.ok(std);
	}
	
	/*
	 	DELETING A STUDENT BY THEIR ROLL NUMBER
	 */
	
	@DeleteMapping(path="/deleteStudentById/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable Integer id){
		
		Student student=studentService.deleteStudentById(id);
		
		return ResponseEntity.ok(student);
		
	}
	
	/*
	 	UPDATE A STUDENT BY THEIR ROLL NUMBER
	 */
	
	@PutMapping(path="/updateStudentById/{id}")
	public ResponseEntity<Student> updateStudentById(@PathVariable Integer id, @RequestBody Student student){
	    student =studentService.updateStudentById(id,student);
		
		return ResponseEntity.ok(student);
	}
	
}
