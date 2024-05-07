package com.kh.Oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		DrinkMaker ar = new DrinkMaker("허브티",1,5);
		DrinkStore as = new DrinkStore(ar,"경기" , "맥아커피",false);
		System.out.println("~~~~~~~~~~~~~~~");
		as.orderDrink();
		
		DrinkMaker ar1 = new DrinkMaker("아메리카노",3,1);
		DrinkStore as1 = new DrinkStore(ar1,"서울 서초구","빠나쁘레쏘",true);
		
				as1.orderDrink();
	}
	
	
}
