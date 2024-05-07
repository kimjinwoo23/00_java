package com.kh.Inheritance.OverLodingEx;

public class Person {
	
	//필드
	private String name;
	private int age;
	//메서드 : 특정행동을 하기위해 묶는 코드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {
		
	}
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	public void displayinfo() {
		System.out.println("이름 : " + name + ", 나이 " + age);
	}
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	

