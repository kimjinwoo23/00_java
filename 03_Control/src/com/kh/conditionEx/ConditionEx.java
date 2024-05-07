package com.kh.conditionEx;

import java.util.Scanner;

//패키지 : 작성한 파일의 폴더 위치 
//조건문 기능용 클래스 

public class ConditionEx {
	/*
	 if 와 else class
	 if 문 : 주어진 조건이 참일떄 실행되는 코드 블록 
	 eise 문 : 조건이 거짓일떄 실행되는 코드 블록 (필수가 아님) 
	 사용 방법 
	 if (조건문) { 조건이 참일경우 실행할 코드 작성 }
	 만약에 조건문의 조건이 참이아닐경우 자동으로 실행 종료 
	 
	 
	 
	  
	 */
	//메서드 1 : 19세 이상은 성인입니다. 출력하기
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 :");
		int age = sc.nextInt();
		//만약에 고객의 나이가 19세 이상이라면 
		if (age >= 19 ) {
			//age의 값이 19 이상이면 성인입니다 출력되게하기 
			System.out.println("성인입니다. ");
		
		} else {
			System.out.println("성인이 아닙니다. ");
		}
	//성인이 아니라면 성인이 아닙니다 출력하기 
	
		
	}
	
	public static void method2() {
		int num = 5;
		//만약에 num이 짝수일경우 짝수입니다 출력하기 
		//짝수 % =0
		if (num % 2 == 0) {
			System.out.println("짝수입니다. ");
		}else {
		 
			System.out.println("홀수입니다");}
	}
		//num이 홀수인경우 홀수입니다 출력하기 
	public static void method3() {
		//0~13 어린이 
		int age = 14;
		if (age > 0 && age < 14) {
			System.out.println("어린이입니다. ");
		}else {
			System.out.println("어린이가 아닙니다. ");
		}
		//14부터는 어린이가 아닙니다 
		
	}

	public static void method4() {
		//나이가 10세이상 20세 미만일떄는 10대 
		//이 외는 10대가 아님 출력 
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 살 인가요 ? ");
		int age = sc.nextInt();
		if (10 <= age && 20 > age) {
		System.out.println("10대 입니다. ");
		}else {
			System.out.println("10대가 아닙니다. ");
		}
	}
	
	public static void method5() {
		//나이가 80세 이상이면 80세 이상입니다. 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 살 이신가요? : ");
		int age = sc.nextInt();
		if (age >= 80) {
			System.out.println("80세 이상입니다" );
		}else {
			System.out.println("80세 이상이 아닙니다" );
		}
		
	}
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
	
	}
}
