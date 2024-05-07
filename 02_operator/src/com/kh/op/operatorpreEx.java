package com.kh.op;

import java.util.Scanner;

public class operatorpreEx {

	public static void main(String[] args) {
		method1();
	}
	
	//static :고정된 이라는 뜻을 가지고있음 
	//static이 붙는것은 자료형이나 변수에 담아서 쓰는게아니라
	//단독으로 고정해서 메모리에서 사용할수있는걸 표현한것 
	public static void method1() {
		
	//필요할떄 꺼내서 사용하는 매서드 
	//메서드: 특정 상태나 기능을 정리해놓은 집합
	//1. int num1 = 10 int num2 = 3 
	// 더하기 빼기 곱하기 나누기 결과를 출력하기 
	//2. double num3 = 2.5 num4 = 3.5 
	//더하기 뺴기 곱하기 나누기 결과 출력하기 
	
	Scanner sc = new Scanner(System.in);
	int a = 10;
	int b = 3;
	
	
	
	int sum = a+b;
	System.out.println("더하기 결과 : " + sum);
	
	int sum2 = a-b;
	System.out.println("뺴기 결과 : " + sum2);
	
	int sum3 = a*b;
	System.out.println("곱하기 결과 : " + sum3);
	 
	int sum4 = a/b;
	System.out.println("나누기 결과 : " + sum4);
	
	double c = 2.5;
	double d = 3.5;
	
	
	double dif = c+d;
	System.out.println("더하기 결과 : " + dif);
	
	double dif2 = c-d;
	System.out.println("빼기 결과  : " + dif2);
	
	double dif3 = c*d;
	System.out.println("곱하기 결과  : " + dif3);
	
	double dif4 = c/d;
	System.out.println("나누기 결과 : " + dif4);	
		
	}

}
