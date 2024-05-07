package com.kh.op;

public class OperatorEx6 {

	
	/*
	 증감 연산자 
	 +=
	 덧셈 연산을 하고 결과에 변수값을 넣어줌
	 -=
	 뺼셈 연산을 하고 결과에 변수값을 넣어줌 
	 이외에도 *= /= %=도 있다
	 */
	
	
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5; 
		//+=연산자를 활용한 예제 
		System.out.println("====== += ======");
		System.out.println("num1 = " + num1 + " num2 = " + num2);
		num1 += 3; 
		System.out.println("num1 += 3 을 해준 num1의 값"+num1 );
		
		num2 += num1;
		System.out.println("num1과: " + num1 + "num2의 값 : " + num2);
		
		int num4 = 10;
		int num5 = 5;
		num4-= 2; //8
		num5-=num4; //-3
		
		
	}

}
