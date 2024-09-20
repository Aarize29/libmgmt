package com.aarize.libmgmt.libmgmt.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
		
	private String name;
	private int roll;
	private List<Integer> booksIssued = new ArrayList();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public List<Integer> getBooksIssued() {
		return booksIssued;
	}
	public void setBooksIssued(List<Integer> booksIssued) {
		this.booksIssued = booksIssued;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", booksIssued=" + booksIssued + "]";
	}
	
	
	
}
