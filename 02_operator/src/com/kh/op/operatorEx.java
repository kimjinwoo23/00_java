package com.kh.op;

import java.util.Scanner;

public class operatorEx {

	public static void main(String[] args) {
	/*
	  입력받은 정수가 3의 배수인지 확인	 
	 */
	//내가 스캐너로 입력받은 값이 출력되게 해보자
	//int a = 1;
	//int b = 3;
	Scanner sc = new Scanner(System.in);
	//a=큰 수를 사용 b는 a보다 작은수 사용 
	System.out.println("계산기 입니다 :) " );
	System.out.println("a값을 입력하세요 *^.^* :");
	System.out.println("b의 값을 입력하세요 >< :");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println(a+b);
	//덧셈
	int sum = a+b;
	System.out.println("덧셈 결과 sum : " + sum);
	//뺄셈
	int dif = a-b;
	System.out.println(" 뺼셈 결과  dif : " + dif);
	//곱셈
	int mul = a*b;
	System.out.println("곱셈 결과 mul : "  + mul);
	//나누기
	int div = b/a;
	System.out.println("나누기 결과 div " + div );
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
