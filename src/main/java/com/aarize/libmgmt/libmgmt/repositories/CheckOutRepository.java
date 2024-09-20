package com.aarize.libmgmt.libmgmt.repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Repository;
import com.aarize.libmgmt.libmgmt.repositories.BookRepository;
import com.aarize.libmgmt.libmgmt.entity.Book;
import com.aarize.libmgmt.libmgmt.entity.CheckOut;
import com.aarize.libmgmt.libmgmt.entity.Student;

@Repository
public class CheckOutRepository implements ICheckOutRepository{
		
	public static List<CheckOut> _checkouts=new ArrayList();
	
	@Override
	public  CheckOut onCheckOut(int roll, int bookId) {
		
	    List<Book> _books = BookRepository._books;
	    List<Student> _students=StudentRepository._students;
	    
	    String  bookName = null;
	    String studentName =null;
	    
	    for(Book book:_books) {
	    	if(book.getBookId()==bookId) {
	    		int newCount=book.getCount();
	    		if(newCount!=0) {
	    			newCount--;
		    		book.setCount(newCount);
		    		bookName=book.getName();
	    		}else {
	    			return new CheckOut();
	    		}
	    	}
	    }
	    
	    
	    
	    for(Student student:_students) {
	    	if(student.getRoll()==roll) {
	    		studentName=student.getName();
	    		 List<Integer> currentBooksIssued = student.getBooksIssued();

	            
	             if (currentBooksIssued == null) {
	                 currentBooksIssued = new ArrayList<>(); 
	             }
	             currentBooksIssued.add(bookId);
	             student.setBooksIssued(currentBooksIssued);
	    	}
	    }
		
		CheckOut ck=new CheckOut();
		
		ck.setBookId(bookId);
		ck.setBookName(bookName);
		ck.setStudentName(studentName);
		ck.setRoll(roll);
		ck.setNewDate(new Date());
		
		_checkouts.add(ck);
		return ck;
	}


    public int calculateDays(Date currentDate, Date issuedDate) {
    	long differenceInMillis = currentDate.getTime() - issuedDate.getTime();
        
        return (int) TimeUnit.DAYS.convert(differenceInMillis, TimeUnit.MILLISECONDS);
    }
	public int calculateFine(int days) {
		
		if(days<5) {
			return 0;
		}
		else if(days<10 && days>5) {
			return 5;
		}
		else if(days<20 && days>10) {
			return 10;
		}else {
			return 50;
		}
		
	}

	public int onReturn(int roll, int bookId) {
	    List<Book> _books = BookRepository._books;
	    List<Student> _students = StudentRepository._students;
	    List<CheckOut> _checkouts = CheckOutRepository._checkouts;

	    CheckOut ck = null;

	    for (Book book : _books) {
	        if (book.getBookId() == bookId) {
	            book.setCount(book.getCount() + 1);
	        }
	    }

	    for (Student student : _students) {
	        if (student.getRoll() == roll) {
	            List<Integer> books = student.getBooksIssued();
	            books.remove(Integer.valueOf(bookId));
	            student.setBooksIssued(books);
	        }
	    }

	    for (CheckOut checkout : _checkouts) {
	        if (checkout.getBookId() == bookId && checkout.getRoll() == roll) {
	            ck = checkout;
	            break;
	        }
	    }

	    if (ck != null) {
	        _checkouts.remove(ck);

	        int days = calculateDays(new Date(), ck.getNewDate());
	        int fine = calculateFine(days);
	        ck.setFine(fine);
	        _checkouts.add(ck);
	        return fine;
	    }

	    return 0; 
	}
 
}
