package com.kh.Oop.method;

public class HamburgerStore {

	private String name;
	private int price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public HamburgerStore() {
		
	}
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void information() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
	}
	public static void main(String[] args) {
		HamburgerStore burger = new HamburgerStore();
		burger.setName("불고기버거");
		burger.setPrice(2000);
		burger.information();
		
		HamburgerStore burger2 = new HamburgerStore(
				"치즈버거",3000);
		burger2.information();
	}
	
	
	
	
	
}
