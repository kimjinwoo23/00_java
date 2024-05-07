package com.kh.ayyayList.pre;

public class Book {
	//책이름 
	private String bookName;
	//저자
	private String author;
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public Book() {
		
	}
	public Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public void showbook() {
		System.out.println(bookName + ",  " + author);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
