package com.kh.inheritance.ex;

import com.kh.inheritance.스마트폰;

public class 갤럭시 extends 스마트폰 {

	//필드 
	private int 안드로이드;

	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}

	public int get안드로이드() {
		return 안드로이드;
	}
	//기본 생성자
	public 갤럭시() {
	}

	public 갤럭시(int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;
	}
	//@Override toString alt shift ss 
	@Override 
	public String toString() {
		return "안드로이드 버전" +안드로이드 + "/" + super.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
