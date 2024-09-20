package com.aarize.libmgmt.libmgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aarize.libmgmt.libmgmt.entity.Student;
import com.aarize.libmgmt.libmgmt.repositories.IStudentRepository;
import com.aarize.libmgmt.libmgmt.repositories.StudentRepository;

@Service
public class StudentService implements IStudentService{
    
	@Autowired
	private IStudentRepository studentRepo;
	
	public StudentService() {
		this.studentRepo=new StudentRepository();
	}
	
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.getAllStudents();
	}


	@Override
	public Student getStudentById(int id) {
		
		return studentRepo.getStudentById(id);
	}


	@Override
	public Student addStudent(Student student) {
		
		return studentRepo.addStudent(student);
	}


	@Override
	public Student deleteStudentById(Integer id) {
		
		return studentRepo.deleteStudentById(id);
	}


	@Override
	public Student updateStudentById(Integer id, Student student) {
		
		return studentRepo.updateStudentById(id,student);
	}


	

	
}
