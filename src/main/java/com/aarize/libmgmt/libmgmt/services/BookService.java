package com.aarize.libmgmt.libmgmt.services;

import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.repositories.BookRepository;
import com.aarize.libmgmt.libmgmt.repositories.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
	
	@Autowired
	private IBookRepository bookRepo;
	
	public BookService() {
		this.bookRepo=new BookRepository();
	}
	public List<Book> getAllBooks(){
		
		return bookRepo.getAllBooks();
	}
	@Override
	public Book getBookById(int id) {
		
		return bookRepo.getBookById(id);
	}
	@Override
	public Book addBook(Book book) {
		return bookRepo.addBook(book);
	}
	@Override
	public Book deleteBookById(Integer id) {
		
		return bookRepo.deleteBookById(id);
	}
	@Override
	public Book updateBookById(Integer id, Book book) {
		
		return bookRepo.updateBookById(id,book);
	}
}
