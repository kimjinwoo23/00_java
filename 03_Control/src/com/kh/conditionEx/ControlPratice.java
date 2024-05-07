package com.kh.conditionEx;

import java.util.Scanner;

public class ControlPratice {

	
	public static void practice1() {
	//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 
	//OO메뉴입니다를 종료 번호를 누르면 “프로그램이 종료됩니다를 출력하세요.	
		
	Scanner sc= new Scanner(System.in);
	System.out.println("1.입력/2.수정/3.조회/4.삭제/7.종료");
	System.out.print("메뉴 번호를 입력하세요 :");
	String menu = sc.next();
	
	switch(menu) {
	case "1" :
		System.out.println("입력 메뉴 입니다 ");
		break;
	case "2":
		System.out.println("수정 메뉴 입니다 ");
		break;
	case "3":
		System.out.println("조회 메뉴 입니다");
		break;
	case"4" : 
		System.out.println("삭제 메뉴 입니다 ");
		break;
	case "7": 
		System.out.println("프로그램이 종료됍니다");
		break;
	default :
		System.out.println("잘못된 메뉴입니다");
		
		
		
		
	}
		
	
		
		
		
	
	}
	
	public static void practice2() {
	//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 
	//짝수다를 출력하고 짝수가 아니면 홀수다를 출력하세요.
	//양수가 아니면 양수만 입력해주세요.를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a = sc.nextInt();
		
		int b = a%2;
		if(a>0 && b==0) {
			System.out.println("짝수다 ");
		}else if(b==1) {
			System.out.println("홀수다");
		}else
			System.out.println("양수만 입력해주세요");
		
		
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		String result; 
		System.out.print("1과 12사이의 정수를 입력해주세요 :");
		int s = sc.nextInt();
		result = "";
		
	switch(s) {
	case 12: case 1: case 2:
		result = "겨울 ";
		break;
	case 3: case 4: case 5: 
		result = "봄  ";
		break;
	case 6: case 7: case 8:
		result = "여름 ";
		break;
	case 9: case 10: case 11:
		result = "가을  ";
		break;
	default :
		System.out.println("잘못 입력된 달입니다");
		
		}
		System.out.println(s + "월은 " + result + "입니다");
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 정수를 입력해주세요 ");
		int a = sc.nextInt();
		System.out.println("두번쨰 정수를 입력해주세요 ");
		int b = sc.nextInt();
		System.out.println("연산기호를 입력해주세요 ( + , - , * , /, % ,)");
		String c = sc.next();
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		practice4();
		
	}

}
