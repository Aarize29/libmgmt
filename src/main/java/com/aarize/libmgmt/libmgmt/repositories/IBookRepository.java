package com.aarize.libmgmt.libmgmt.repositories;

import java.util.List;

import com.aarize.libmgmt.libmgmt.entity.Book;


public interface IBookRepository {

	
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public Book deleteBookById(Integer id);
	public Book updateBookById(Integer id, Book book);
}
