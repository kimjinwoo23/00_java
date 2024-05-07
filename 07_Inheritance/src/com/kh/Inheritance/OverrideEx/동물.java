package com.kh.Inheritance.OverrideEx;

public class 동물 {
	
	
	String 이름; 
	
	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get이름() {
		return 이름;
	}
	
	//생성자 
	public 동물() {
		
	}
	public 동물(String 이름) {
		this.이름 = 이름;
	}
	
	public void 소리() {
		System.out.println("동물이 소리를 냅니다.");
	}
	
	
	
	
}
