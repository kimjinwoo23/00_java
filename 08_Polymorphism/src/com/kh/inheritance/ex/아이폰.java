package com.kh.inheritance.ex;

import com.kh.inheritance.스마트폰;

public class 아이폰 extends 스마트폰 {

	
	private int IOS;

	public void setIOS(int iOS) {
		IOS = iOS;
	}

	public int getIOS() {
		return IOS;
	}
	public 아이폰() {
	}

	public 아이폰(int iOS ,String 화면,String 통신사,String 성능) {
		super(화면,통신사,성능);
		IOS = iOS;
	}
	public String toString() {
		return "아이폰 버전" +IOS + "/" + super.toString();
	}
	
	
	
	
	
	
	
}
