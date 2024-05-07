package com.kh.practice.book.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;
	private int Calender;
	private double discount;
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCalender(int calender) {
		Calender = calender;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public int getCalender() {
		return Calender;
	}
	public double getDiscount() {
		return discount;
	}
	public Book() {
	}
	public Book(String title, String author, int price, int calender, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		Calender = calender;
		this.discount = discount;
	}
	public String toString() {
		return author;
		
		
		
	}
	
	
}
