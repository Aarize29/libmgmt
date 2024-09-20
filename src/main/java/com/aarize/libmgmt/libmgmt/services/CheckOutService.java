package com.aarize.libmgmt.libmgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.CheckOut;
import com.aarize.libmgmt.libmgmt.entity.Student;
import com.aarize.libmgmt.libmgmt.repositories.CheckOutRepository;
import com.aarize.libmgmt.libmgmt.repositories.ICheckOutRepository;

@Service
public class CheckOutService implements ICheckOutService{
	@Autowired
	private ICheckOutRepository checkoutrepo;
	
	public CheckOutService() {
		this.checkoutrepo=new CheckOutRepository();
	}

	@Override
	public CheckOut onCheckOut(int roll, int bookId) {
		
		return checkoutrepo.onCheckOut(roll, bookId);
	}

	@Override
	public int onReturn(int roll, int bookId) {
		return checkoutrepo.onReturn(roll, bookId);
	}

}
