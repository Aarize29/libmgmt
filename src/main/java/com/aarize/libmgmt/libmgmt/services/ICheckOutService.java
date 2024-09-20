package com.aarize.libmgmt.libmgmt.services;

import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.CheckOut;
import com.aarize.libmgmt.libmgmt.entity.Student;

public interface ICheckOutService {

	
	public CheckOut onCheckOut(int roll, int bookId);
	
	public int onReturn(int roll, int bookId);
} 
