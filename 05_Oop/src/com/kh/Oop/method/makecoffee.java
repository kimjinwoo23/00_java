package com.kh.Oop.method;

public class makecoffee {
//필드 
	private String coffeeType;
	private int sugar;
	private boolean milk;
	
 	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public String getCoffeeType() {
		return coffeeType;
	}

	public int getSugar() {
		return sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public makecoffee() {
 		
 	}
	
	public makecoffee(String coffeeType,boolean milk,int sugar) {
		this.coffeeType=coffeeType;
		this.milk= milk;
		this.sugar = sugar;
	}

	
	public void makecoffee() {
		System.out.println("커피 종류 : " + coffeeType);
		System.out.println("우유 유무 : " + milk);
		System.out.println("설탕 : "  + sugar);
	}
	}
		/*
	//만약에 우유가 추가됐다면
	if(milk) {
		System.out.println("우유 추가 ");
	}else {
		System.out.println("우유 미추가");
	}
	System.out.println("커피가 준비되었습니다");
	}
	public static void main(String[] args) {
		makecoffee coffee = new makecoffee();
		coffee.setCoffeeType("아메리카노");
		coffee.setSugar(10);
		coffee.setMilk(false);
		
		coffee.makecoffee();
		
		Cafe coffee1 = new makecoffee("디카폐인 ", true,20);
		coffee1.makecoffee();
		
	}
}*/
