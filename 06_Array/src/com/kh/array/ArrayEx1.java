package com.kh.array;

import java.util.Scanner;

/*
 배열(자료구조)
 	같은자료형의 변수를 하나의 묶음으로 다루는 것 
 	생성된 배열은 index를 이용해서 구분
 	index 시작숫자는 0 마지막 숫자는 (마지막숫자-1)
 	
 	생성된 배열을 활용하기 위해서는 배열을 참조하는 참조형 변수를 이용함
 	[참조형변수란] -주소를 저장하는 변수 
 	-소문자로 시작하는 자료형(ex : int double 등)제외한 나머지모두 참조형변수
 	대표적인 참조형 변수: String 
 	
 	배열의 선언과 생성방법 
 	정수 배열 
 	int[] numbers = new int[5]
 	numbers 에는 숫자 5개 넣을수있는 공간생성 
 	
 	
 */
public class ArrayEx1 {
	
	public static void main(String[] args) {
		//숫자 배열 선언과 생성
		int[] numbers = new int[5];
		//int 5 라는건 
		//index로 01234 로 4까지가 한계
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		numbers[0] = 10;
		System.out.println(numbers[0]);
		//0~4까지 자리에 10 20 30 40 50 넣기
		
		numbers[1] = 20;
		
		numbers[2] = 30;
		
		numbers[3] = 40;
		
		numbers[4] = 50;
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		String[] str = new String[6];
		str[0] ="월";
		str[1] ="화";
		str[2] ="수";
		str[3] ="목";
		str[4] ="금";
		str[5] ="토";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
	}

	public static void practice6() {
		
		String week[] = {"월","화","수","목","금","토","일"};
		Scanner sc = new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.println("0부터 6까지의 숫자를 입력하세요");
		int num = sc.nextInt();
		if(num >=0 && num <= 6) {
			System.out.println(week[num] + "요일");
		}else {
			System.out.println("잘못입력한 수입니다");
		}
		
		
		
		
	}
 
	
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	

