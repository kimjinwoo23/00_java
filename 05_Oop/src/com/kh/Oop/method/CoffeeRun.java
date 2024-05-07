package com.kh.Oop.method;

public class CoffeeRun {

	
	public static void main(String[] args) {
		//카페 객체 생성
		makecoffee coffee1 = new makecoffee();
		coffee1.setCoffeeType("아메리카노~");
		coffee1.setSugar(33);
		coffee1.setMilk(false);
		
		coffee1.makecoffee();
	}
	
}
