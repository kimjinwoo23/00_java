package com.kh.Inheritance.OverrideEx;

public class 고양이 extends 동물{

	public 고양이(String 이름) {
		super(이름);
	}
	//동물의 소리를 가지고와서 고양이소리로변경
	@Override
	public void 소리() {
		System.out.println(이름 + " 이 야옹소리를 냅니다" );
	}
	
	
	
	
	
}
