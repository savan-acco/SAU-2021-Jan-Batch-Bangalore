package com.hib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Library {
	
	@Id
	private int book_no;
	private String book_name;
	
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
