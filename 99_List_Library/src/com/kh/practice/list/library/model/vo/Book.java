package com.kh.practice.list.library.model.vo;

public class Book {
	
	//필드 
	private String title;
	private String author;
	private String category;
	private int price;
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	public Book() {
		
	}
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "title" + title + "author" + author + " category"+category + "price " + price;
	}
	
	
	}
	
	
	
	
	
	


