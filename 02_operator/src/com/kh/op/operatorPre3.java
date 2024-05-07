package com.kh.op;

import java.util.Scanner;

public class operatorPre3 {

	public static void method1() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값은 : ");
		int a = sc.nextInt();
		System.out.print("b의 값은 : ");
		int b = sc.nextInt();
		
		boolean result1 = a<b; 
		boolean result2 = a<=b; 
		boolean result3 = a>=b;
		boolean result4 = a>b;
		System.out.println("1번 : " + result1);
		System.out.println("2번 : " + result2);
		System.out.println("3번 : " + result3);
		System.out.println("4번 : " + result4);
	}
	//&&, || 두개에 연산을할떄 각 항에 괄호를 넣어서
	//연산 순서를 맞춰줄것 
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값은 : ");
		int a = sc.nextInt();
		System.out.println("b의 값은 : ");
		int b = sc.nextInt();
		System.out.println("c의 값은 : ");
		int c = sc.nextInt();
		boolean sos1 = (a<=b) && (b!=c);
		boolean sos2 = (a>=b) || (b==c);
		System.out.println("1번 : "+ sos1);
		System.out.println("2번 : "+ sos2);
	}
	
	public static void main(String[] args) {
		//method1();
		method2();
	}
		
}
