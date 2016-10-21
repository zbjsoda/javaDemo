package com.Exp2;

public class Book {
	String bid;
	String bname;
	public Book(String bid, String bname){
		this.bid = bid;
		this.bname = bname;
		
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}

}
