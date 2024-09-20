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

import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.Student;
import com.aarize.libmgmt.libmgmt.repositories.IBookRepository;
import com.aarize.libmgmt.libmgmt.services.BookService;
import com.aarize.libmgmt.libmgmt.services.IBookService;
import com.aarize.libmgmt.libmgmt.services.IStudentService;

@RestController
public class BookController {
   
	@Autowired
    private IBookService bookService;
	
	public BookController() {
		// TODO Auto-generated constructor stub
	
		this.bookService=new BookService();
	}
	
	/*
	 		GETTING ALL THE BOOKS
	 */
	@GetMapping(path="/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	/*
	   		GETTING ONE BOOK AT A TIME USING BOOK_ID
	 */
	@GetMapping(path="/getBookById/{id}")
	public ResponseEntity<Book> getBookById( @PathVariable Integer id ){
		
		Book book=bookService.getBookById(id);
		
		return ResponseEntity.ok(book);
	}
	
	/*
	  		ADDING BOOKS
	 */
	@PostMapping(path="/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
			
			 book = bookService.addBook(book);
			
			
			return ResponseEntity.ok(book);
	}
	
	/*
	    	DELETING A BOOK USING IT'S BOOK_ID
	 */
	
	@DeleteMapping(path="/deleteBookById/{id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable Integer id){
		
		Book book=bookService.deleteBookById(id);
		return ResponseEntity.ok(book);
	}
	
	/*
	      UPDATE A BOOK BY IT'S ID
	 */
	@PutMapping(path="/updateBookById/{id}")
	public ResponseEntity<Book> updateBookById(@PathVariable Integer id, @RequestBody Book book){
		
		 book=bookService.updateBookById(id,book);
		 return ResponseEntity.ok(book);
	}
	
	
	
}
