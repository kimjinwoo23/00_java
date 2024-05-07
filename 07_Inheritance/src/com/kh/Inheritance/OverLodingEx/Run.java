package com.kh.Inheritance.OverLodingEx;

public class Run {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		Person p2 = new Person();
		p2.setName("박영희");
		Person p3 = new Person("김철수",12);
		
		
		p1.displayinfo();
		p2.displayinfo();
		p3.displayinfo();
	}
	
	
	
}
