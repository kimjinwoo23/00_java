package com.kh.Oop.method.ex;

public class iceCream {

	private String name;
	private int sugar;
	private boolean milk;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	public iceCream() {
		
	}
	public iceCream(String name , int sugar , boolean milk) {
		this.milk= milk;
		this.name= name;
		this.sugar = sugar;
		
	}
	public void makeIceCream() {
		System.out.println("아이스크림 이름 " + name);
		System.out.println("설탕 : " + sugar);
		
		
		if(milk) {
			System.out.println("우유추가");
		}else {
			System.out.println("우유 미추가");
		}
	}
	public static void main(String[] args) {
		iceCream IceCream = new iceCream();
		IceCream.setName("바닐라 아이스크림");
		IceCream.setSugar(20);
		IceCream.setMilk(true);
		IceCream.makeIceCream();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}