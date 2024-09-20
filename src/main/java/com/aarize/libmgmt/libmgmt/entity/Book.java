package com.aarize.libmgmt.libmgmt.entity;


public class Book {
		
	private String name;
	private String author;
	private int count;
	private int bookId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", count=" + count + ", bookId=" + bookId + "]";
	}
	
	
}
