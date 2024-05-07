package com.kh.Oop.method.oop;
//커피가게 클래스
public class CoffeeStore {
//필드
	//make coffee가져오기
	private CoffeeMaker maker;
	private String Storename;
	private String location;
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setStorename(String storename) {
		Storename = storename;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//메서드 
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStorename() {
		return Storename;
	}
	public String getLocation() {
		return location;
	}
	
	public CoffeeStore() {
		
	}
	public CoffeeStore(CoffeeMaker maker, String name, String location
			) {
		this.location = location;
		this.maker = maker;
		this.Storename = name;
	}
	public void ordercoffee() {
		System.out.println("지역 : " + location);
		
		 System.out.println(Storename + "에 주문한 커피정보");
		 maker.makecoffee();
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
