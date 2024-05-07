package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
	//스캐너로 입력한 값이 true 인지 false 확인
		
	Scanner sc = new Scanner(System.in);
	System.out.println("a의 값을 입력하세요 :");
	int a = sc.nextInt();		
	System.out.println("b의 값을 입력하세요 :");
	int b = sc.nextInt();
	
	System.out.println("a : " + a + " b : " + b );
	System.out.println("a와 b가 같으면 == true가 나온다");
	System.out.println("a==b : " + (a==b));
	System.out.println("a와 b가 다르면 != false가 나온다");
	System.out.println("a!=b " + (a!=b));
	}
	
	//method2 를 만들어서 증감 연산자를 사용한 다음 
	//비교연산자를 사용해서 값이 같은지 틀린지 확인한다 
	
	public static void method2() {

	Scanner sc = new Scanner(System.in);
	System.out.println("c의 값을 입력하세요");
	int c = sc.nextInt();
	System.out.println("d의 값을 입력하세요");
	int d = sc.nextInt();
	int e = ++c;
	
	//int f = ++c 를 한다면 f의 값은 어떻게 나오는지 
	//System.out.println("f : " + f); f 값 출력해보기
	
	System.out.println("c : " + c + " d : "  +d + " e " + e);
	System.out.println("c==d : " + (c==d));
	System.out.println("c == e " + (c==e));
	
	int f = ++c;
	System.out.println(" f : " + f);
	
	
	
	}
	
	//method3 만들어서 사용하기 
	
	public static void method3() {
	Scanner sc = new Scanner(System.in);
	//모든 사람이 사탕을 골고루 나눠가지려고한다
	//인원수와 사탕 개수를 키보드로 입력받기 
	System.out.println("인원수를 입력하세요 : ");
	
	int people = sc.nextInt(); //인원수 구하기 
	System.out.println("사탕 파티에 " + people + " 명이 참석했습니다 ");
	System.out.println("현재 보유하고있는 총 사탕의 개수를 입력하세요 : ");
	
	int candies = sc.nextInt();
	
	System.out.println("현재 가지고 있는 사탕은 " + candies + " 개 입니다. ");
	System.out.println("그렇군요, 그렇다면 동일하게 나눠가질 사탕의 갯수는 몇 개 입니까? ");
	
	
	//한사람당 동일하게 나눠가질 사탕의 개수 =총 사탕의 개수/ 총 인원수 
	                             int person = candies / people;
	
	
	//1인당 동일하게 나눠가진 사탕의 개수와
	System.out.println("1인당 동일하게 나눠가진 사탕의갯수 :" + person);
	
	                             
	//나눠주고 남은 사탕의 개수를 출력하기 
	//남은 사탕의 개수 = 총 사탕의 개수 % 사람;
	int remain = candies % people;
	System.out.println("나누고 남은 사탕의 개수는 : " + remain);
	
	
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
	//최종으로 출력할 매서드만 작성
	method1();
	//method2();
    //method3();
	}

}
