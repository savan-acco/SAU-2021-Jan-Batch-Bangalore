package com.multithreading;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import java.util.HashMap;
import java.util.LinkedList; 

// Book class to define properties of Books in Library
class Book
{

	String name; //name of book
	Integer ISBN_no; // ISBN code
	Integer available; // check if book is available
	
	//constructor
	public Book(String name, Integer iSBN_no, Integer available) {
		super();
		this.name = name;
		ISBN_no = iSBN_no;
		this.available = available;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getISBN_no() {
		return ISBN_no;
	}
	
	public void setISBN_no(Integer iSBN_no) {
		ISBN_no = iSBN_no;
	}
	
	
	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}
	 
}
 
class Library { 
	
	 ArrayList<Book> list; // list of books in Library
	 
	 public Library() {
		super();
		this.list = new ArrayList<Book>();
	}

	//function to buy a book from library
	public void buy(assign as,int book_index) throws InterruptedException 
	{ 
		int value = 0; 
		
		// check if book is available, wait if not available
		while (this.list.get(book_index).available==0) 
			wait(); 
		
		
		Date startDate = new Date();
		Date now = new java.util.Date();
		
		//300000
		//synchronize this method for 5 minutes as per the question
		while ((int)((now.getTime() - startDate.getTime()) / 1000)<=300000) { 
			synchronized (this) 
			{ 
				
				// checking if book with same name exists in car (get the frequency)
				
				int count=0;
				if (as.books_possess.containsKey(this.list.get(book_index).name)) {
				count=as.books_possess.get(this.list.get(book_index).name);
				}
			
				
				as.books_possess.put(this.list.get(book_index).name,count+1); // add book in (cart)
				this.list.get(book_index).available=0; //make book with given book_index - unavailable for others 
				
				
				//S.O.P
				System.out.println(as.name + " has bought new book named " + this.list.get(book_index).name);
				
				
				
				// notifies the other threads  
				notify(); 

				
				break; // get out of while(true) 
			} 
		} 
	} 

	// Function to return book to library back
	public void keep(assign as,int book_index) throws InterruptedException 
	{ 
		if(as.books_possess.containsKey(this.list.get(book_index).name)==false)
		{
			System.out.println("You dont possess book which you want to return ");
			return ;
		}
		
		
		while (true) { 
			synchronized (this) 
			{ 

				//S.O.P
				System.out.println(as.name + " is returning book named " + this.list.get(book_index).name);
				
				
				// get book from cart
				int count=0;
				if (as.books_possess.containsKey(this.list.get(book_index).name)) {
				count=as.books_possess.get(this.list.get(book_index).name);
				} 
				
				
				as.books_possess.put(this.list.get(book_index).name,count-1); //removing book from cart
				
				
				this.list.get(book_index).available=1; // make book available for others
				
				
				// notify other threads so that they can access book
				notify(); 

				
				
				break;// get out of while(true) 
			} 
		} 
	} 
}



// driver class
public class assign { 
	
	String name; // name of person	
	HashMap<String, Integer> books_possess; // books possessed by person with frequency
	
	public assign(String name)
	{
		this.books_possess=new HashMap<String,Integer>();
		this.name=name;
	}
	
	public static void main(String[] args) 
		throws InterruptedException 
	{ 
		
		// create instance of library 
		Library obj=new Library();
		
		obj.list.add(new Book("Harry Potter",2,1));
		obj.list.add(new Book("Bhagvat gita",23,1));
		obj.list.add(new Book("Nobita",132,1));
		obj.list.add(new Book("Doraemon",456,1));
		obj.list.add(new Book("Perman",535,1));
		obj.list.add(new Book("FPS",54,1));
		obj.list.add(new Book("127 Hours",647,1));
		obj.list.add(new Book("Unbroken",3775,1));
		obj.list.add(new Book("Blind space",8686,1));
		obj.list.add(new Book("Romeo",28686,1));
		// here in this case i am adding 10 books in library for our reference
		
		
	
		
		
		assign as1 = new assign("Mohan"); 
		assign as2 = new assign("Kunal"); 
		assign as3 = new assign("Aman"); 
		assign as4 = new assign("Rajat"); 

		// Create thread 
		Thread t1 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					obj.buy(as1,1); // buy book with book_index as 1 in library
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 
		

		// Create thread 
		Thread t2 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					obj.keep(as1,1); // sell book with book_index as 1 in library
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		});
		
		
		// Create thread 
		Thread t3 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					obj.buy(as2,4); // buy book with book_index as 4 in library
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 
		

		// Create thread 
		Thread t4 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					obj.keep(as2,4); // sell book with book_index as 4 in library
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		});		
		
		// you can add more threads 
		
		
		
		
		

		// Start both threads 
		t1.start(); 
		t2.start(); 
		t3.start(); 
		t4.start(); 
		

		// t1 finishes before t2 
		t1.join(); 
		t2.join(); 
		t3.join(); 
		t4.join(); 
		
	} 

	 
}






