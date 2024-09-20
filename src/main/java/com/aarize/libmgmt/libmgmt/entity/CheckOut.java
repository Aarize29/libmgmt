package com.aarize.libmgmt.libmgmt.entity;

import java.util.Date;

public class CheckOut {
		
	private String bookName;
	private int bookId;
	private String  studentName;
	private int roll;
	private int fine;
	private Date newDate;
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public Date getNewDate() {
		return newDate;
	}
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "CheckOut [bookName=" + bookName + ", bookId=" + bookId + ", studentName=" + studentName + ", roll="
				+ roll + ", fine=" + fine + ", newDate=" + newDate + "]";
	}
	
	
}
