package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	public static void method1() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해주세요");
	int num1=sc.nextInt();
	System.out.println("숫자를 하나 더 입력해주세요 ");
	int num2=sc.nextInt();
	if (num1==num2 ) {
		System.out.println(num1 + "과"+num2 +"같습니다 ");
	}else {
		System.out.println(num1 + "과"+num2 + "는 같지않습니다");
	}
	
	}
	
	public static void method2() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("문자를 입력해주세요 ");
	String str1 = sc.nextLine();
	System.out.println("문자를 입력해주세요 ");
	String str2 = sc.nextLine();
	if(str1.equals(str2)) {
		System.out.println(str1 + "과" + str2 + "는 같습니다");
	}else {
		System.out.println(str1 + "과" + str2 + "는 같지않습니다");
	}
	}
	
	public static void method3() {
	
	Scanner sc = new Scanner(System.in);
	double double1 = sc.nextDouble();
	double double2 = sc.nextDouble();
			
	if(double1 == double2) {
		
	}
	}
	
	
	
	
	public static void main(String[] args) {
			method1();
			method2();
	}

}
