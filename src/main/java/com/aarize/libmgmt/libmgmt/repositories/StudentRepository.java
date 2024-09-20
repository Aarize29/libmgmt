package com.aarize.libmgmt.libmgmt.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.Student;

@Repository
public class StudentRepository implements IStudentRepository {

	public static List<Student> _students =new ArrayList();
	
	
	public static void setStudentDetails() {
		Student student =new Student();
		student.setName("Aarize");
		student.setRoll(1);
		
		_students.add(student);
		
		student =new Student();
		student.setName("Faisal");
		student.setRoll(2);
		_students.add(student);
		
		student =new Student();
		student.setName("Shadan");
		student.setRoll(3);
		
		_students.add(student);
		
	}
	
	
	@Override
	public List<Student> getAllStudents() {

		return _students;
	}


	@Override
	public Student getStudentById(int id) {
		
		for(Student s:_students) {
			
			if(s.getRoll()==id) {
				return s;
			}
			
			
		}
		
		return new Student();
	}


	@Override
	public Student addStudent(Student student) {
		
		_students.add(student);
		
		return student;
	}


	@Override
	public Student deleteStudentById(Integer id) {
		
		for(Student s:_students) {
			if(s.getRoll()==id) {
				_students.remove(s);
				return s;
			}
		}
		return new Student();
	}


	@Override
	public Student updateStudentById(Integer id,Student student) {
		
		for (int i = 0; i < _students.size(); i++) {
	        if (_students.get(i).getRoll() == id) {
	            _students.set(i, student); 
	            return student;
	        }
	    }
		return new Student();
	}
	
	

}
