package com.aarize.libmgmt.libmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aarize.libmgmt.libmgmt.repositories.BookRepository;
import com.aarize.libmgmt.libmgmt.repositories.StudentRepository;

@SpringBootApplication
public class LibmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibmgmtApplication.class, args);
		StudentRepository.setStudentDetails();
		BookRepository.setBookDetails();
		
	}

}
