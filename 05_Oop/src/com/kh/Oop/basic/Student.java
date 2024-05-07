package com.kh.Oop.basic;

public class Student {
	//학
	
	public String name;
	public int age;
	public int grade;
	//학생 이름 나이 학년 
	
	//생성자 = 
		// 클래스명과같은		필요한 정보
	public Student(String name, int age) {
		this.name = name;
		this.age = age; //this로 값 설정
	}
	
	public void info() {	//정보 나열 
		System.out.println("이름 : " + name);
	}
	
	//최종메서드로 공간을 만든후에 정보기입
	
	
	
	
	
	
	
	
	
	
	
	
}
