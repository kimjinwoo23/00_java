package com.kh.Oop.method.oop;

public class DrinkStore {

	private DrinkMaker  maker;
	private String  location;
	private String  name;
	private boolean takeout;
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	public DrinkStore() {
		
	}
	public DrinkStore(DrinkMaker maker,String location,
			String  name, boolean takeout) {
		this.location = location;
		this.maker = maker;
		this.name = name;
		this.takeout=takeout;	
	}
	public void orderDrink() {
		System.out.println(location + " " + name + "에 주문한 정보");
		maker.makeDrink();
	if(true) {
		System.out.println("테이크아웃");
	}else {
		System.out.println("매장 내 섭취");
	}
	
}
	
	
	
	
	
	
}
