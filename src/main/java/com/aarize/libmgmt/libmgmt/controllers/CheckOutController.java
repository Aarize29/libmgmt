package com.aarize.libmgmt.libmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aarize.libmgmt.libmgmt.dto.CheckOutRequest;
import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.CheckOut;
import com.aarize.libmgmt.libmgmt.services.CheckOutService;
import com.aarize.libmgmt.libmgmt.services.ICheckOutService;

@RestController
public class CheckOutController {

	@Autowired
	private ICheckOutService checkOutService;
	public CheckOutController() {
		this.checkOutService=new CheckOutService();
	}
	
	@PostMapping(path="/checkout")
	public ResponseEntity<CheckOut> onCheckOut( @RequestBody CheckOutRequest request){
		 CheckOut checkout = checkOutService.onCheckOut(request.getRoll(), request.getBookId());
		 return ResponseEntity.ok(checkout);
		
	}
	
	@PostMapping(path="/onreturn")
	public ResponseEntity<Integer>onReturn(@RequestBody CheckOutRequest request){
		Integer fine=checkOutService.onReturn(request.getRoll(), request.getBookId());
		
		return ResponseEntity.ok(fine);
	}
} 
