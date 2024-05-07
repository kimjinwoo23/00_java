package com.kh.abstractEx;
/*
 abstract class (추상클래스)
 미완성인 클래스 컴퓨터에 추상클래스로만든 
 파일의 공간이 생겨나지못함
 사용예제 
 [접근제어자]abstract class 파일명{
 접근제어자: public protected default private 
 //메서드 (필수는아님)
  [접근제어자] abstract 지정값 변수명();
  
  
   */
public abstract class 도형 {
	
	

	public abstract double 도형넓이();
	public abstract double 도형둘레();
	
	public void 출력정보() {
		System.out.println("이도형은 넓이가 " + 도형넓이() + 
				" 이고 둘레가 " +  도형둘레()+ "입니다");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
