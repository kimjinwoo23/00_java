package com.kh.Inheritance.OverrideEx;

public class 강아지 extends 동물 {
//강아지가 동물에서 소리를 상속
	public 강아지(String 이름) {
		super(이름);

	//super : 자바에서 자식클래스의 생성자는 반드시 상위클래스의 생성자를호출
		//호출할떄 super()사용하여 호출하고 상위클래스의 생성자를호출할수있음
	
			
	}
	
	
	//override : 부모클래스에서 부모가 가진 메서드를 다시 작성하거나 수정해서 정의할떄 사용
	//필수는 아니지만 작성을 해줘서 부모클래스에서 가져와 수정했다는걸 알려주는표시
	
	@Override
	public void 소리() {
		System.out.println(이름 + "이가 멍멍 짖습니다 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
