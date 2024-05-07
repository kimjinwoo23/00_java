package com.kh.Oop.method;

public class PizzaStore {

	
	private String pizzName;
	private int pizzePrice;
	
	public void setPizzName(String pizzName) {
		this.pizzName = pizzName;
	}
	public void setPizzePrice(int pizzePrice) {
		this.pizzePrice = pizzePrice;
	}
	public String getPizzName() {
		return pizzName;
	}
	public int getPizzePrice() {
		return pizzePrice;
	}


public PizzaStore() {
	
}

//매서드 : 필수 생성자:피자의 이름 가격
public PizzaStore(String pizzaName,int pizzaPrice) {
	this.pizzePrice = pizzaPrice;
		this.pizzePrice = pizzaPrice;
}


public void infomation() {
	System.out.println("피자 이름 : " + pizzName);
	System.out.println("피자 가격 : " + pizzePrice);
	
}

public static void main(String[] args) {
	PizzaStore pizza = new PizzaStore();
	pizza.setPizzName("페퍼로니 피자");
	pizza.setPizzePrice(11000);
	
	pizza.infomation();
	
	System.out.println("~~~~~~~~~~~~~~~");
	
	PizzaStore pizza2 = new PizzaStore();
	pizza2.setPizzName("포테이토피자");
	
	pizza2.infomation();
			//필수생성자로 피자 생성
			
	PizzaStore pizza3 = new PizzaStore("치즈피자",13000);
	pizza3.infomation();
	
	
	
}







}