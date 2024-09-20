package com.aarize.libmgmt.libmgmt.repositories;

import java.util.List;

import com.aarize.libmgmt.libmgmt.entity.Student;

public interface IStudentRepository {
		
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public Student addStudent(Student student);
	public Student deleteStudentById(Integer id);
	public Student updateStudentById(Integer id,Student student);
}
