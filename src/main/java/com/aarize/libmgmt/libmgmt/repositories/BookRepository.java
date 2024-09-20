package com.aarize.libmgmt.libmgmt.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aarize.libmgmt.libmgmt.entity.Book;

@Repository
public class BookRepository implements IBookRepository {
	
	
	public static List<Book> _books=new ArrayList();
	
	
	public static  void setBookDetails() {
		Book book=new Book();
	    book.setName("Coding xyz");
	    book.setAuthor("Mark");
	    book.setCount(20);
	    book.setBookId(1);
	    
	    _books.add(book);
	    
	    book=new Book();
	    book.setName("programing in c");
	    book.setAuthor("Sundar");
	    book.setCount(15);
	    book.setBookId(2);
	    
	    _books.add(book);
	    book=new Book();
	    book.setName("Nodejs tuotrial");
	    book.setAuthor("Steve");
	    book.setCount(20);
	    book.setBookId(3);
	    
	    _books.add(book);
	    book=new Book();
	    book.setName("Reactjs for pros");
	    book.setAuthor("Aarize");
	    book.setCount(20);
	    book.setBookId(4);
	    
	    _books.add(book);
	    
	    
	}
	
	
	public List<Book> getAllBooks(){
		
		
		return _books;
	}


	@Override
	public Book getBookById(int id) {
		
		for(Book book:_books) {
			if(book.getBookId()==id) {
				return book;
			}
		}
		
		return new Book();
	}


	@Override
	public Book addBook(Book book) {
		
		_books.add(book);
		return book;
	}


	@Override
	public Book deleteBookById(Integer id) {
		
		for(Book book:_books) {
			if(book.getBookId()==id) {
				_books.remove(book);
				return book;
			}
		}
		return new Book();
	}


	@Override
	public Book updateBookById(Integer id, Book book) {
		
		for(int i=0;i<_books.size();i++) {
			
			if(_books.get(i).getBookId()==id) {
				_books.set(i, book);
				return book;
			}
		}
		
		return new Book();
	}
}
