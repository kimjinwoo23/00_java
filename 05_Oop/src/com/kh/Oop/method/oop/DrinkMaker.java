package com.kh.Oop.method.oop;

public class DrinkMaker {

	private String drinkType; //음료종류
	private int quantity;//음료 양
	private int temp; //온도
	
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTemp() {
		return temp;
	}

	public DrinkMaker () {
		
	}
	public DrinkMaker(String drinkType,int quantity,int temp) {
		this.drinkType= drinkType;
		this.quantity=quantity;
		this.temp=temp;
		
		
	}
	
	public void makeDrink() {
		System.out.println("음료 종류 : " + drinkType);
		System.out.println("음료 양   : " + quantity);
		System.out.println("온도 : " + temp);
		if(temp <5) {
			System.out.println("차갑게");
			
		}else if(5 <= temp && temp <= 10) {
			System.out.println("미지근하게");
			
		}else {
			System.out.println("뜨겁게");
			
		}
		System.out.println("음료제조가 완료됐습니다");
		
	}
	
	
	
	
	
	
	
	
}
