package com.kh.example.practice1.model.vo;

public class Member {
	
	public String memberId;
	public String memberPwd;
	public String memverName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member() {
		
	}
	
		
	public void changeName(String name) {
		System.out.println("이름 : " + name);
	}
	public void printname() {
		System.out.println("이름 : " + memverName);
	}
	
	
	
	
	
	
	
	
	
	
}
