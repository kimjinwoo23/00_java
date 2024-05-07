package com.kh.Oop.constructor;

public class Cafe {

	//필드 선언 이름 지역 테이블 수 
	public String name;
	public String location;
	public int tableNum;
	
	public Cafe() {
		
	}
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	
	public void CafeInfo() {
		//이름 지역 테이블 수 출력
		System.out.println("카페이름 : " + name);
		System.out.println("지 역  : " + location );
		System.out.println("테이블 수 : " + tableNum);
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		Cafe cafe1 = new Cafe();
		cafe1.name = "스타벅스";
		cafe1.tableNum = 99;
		cafe1.CafeInfo();
		
		Cafe cafe2 = new Cafe();
		cafe2.location = "서울";
		cafe2.tableNum = 14;
		cafe2.CafeInfo();
		
		Cafe cafe3 = new Cafe("엔젤리너스", "서울", 5);
		cafe3.CafeInfo();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
