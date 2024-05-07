package com.kh.op;

import java.util.Scanner;

//class 바깥에는 package랑 import만 작성가능 
//이외 실행하고싶은 내용은 class안에 작성해야합니다

public class OperatorEx2 {
	
	//1. 매서드: 스캐너를 사용하지않는 매서드 
	public static void mathod1() {

	int num1 = 20; 
	int num2 = 5;
	int 더하기 =num1+num2;
	int 빼기 = num1-num2;
	int 곱하기 = num1*num2;
	int 나누기 = num1/num2;
	System.out.println("더하기 : "+ 더하기);
	System.out.println("빼기 : "+ 빼기);
	System.out.println("곱하기 : "+ 곱하기);
	System.out.println("나누기 : "+ 나누기);
	
	}
	public static void mathod2() {
	double num3 = 1.4; 
	double num4 = 2.5;
	double 더하기 =num3+num4;
	double 빼기 = num3-num4;
	double 곱하기 = num3*num4;
	double 나누기 = num3/num4;
	System.out.println("sum : "+ 더하기);
	System.out.println("sub : "+ 빼기);
	System.out.println("mlu : "+ 곱하기);
	System.out.println("div : "+ 나누기);
	}
	//mathod3 () -> Scanner 
	//메서드 옆에있는 () 나중에 어떤 값을 받을떄 사용 
	//값을 받을일이없으면 빈 공간으로 유지 
	public static void mathod3() {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("num5 숫자를 입력하세요 :(");
	int num5 = sc.nextInt(); 
	//키보드로 작성한 숫자가 num5로 들어올수있게 변수 선언
	System.out.println("num6 숫자를 입력하세요 ");
	int num6 = sc.nextInt();
	//키보드로 작성한 숫자가 num6로 들어올수있게 변수 선언
	
	int sum1 = num5 + num6;
	int sub1 = num5 - num6;
	int mul1 = num5 * num6;
	int div1 = num5 / num6;
	
	System.out.println("sum1 : " + sum1);
	System.out.println("sub1 : " + sub1);
	System.out.println("mul1 : " + mul1);
	System.out.println("div1 : " + div1);
	}
	
	
	//mathod4를 만들어서 스캐너로double 
	//더하기 뺴기 곱하기 나누기 출력하기
	//double num7 sc.nextDouble();
	//double num8 sc.nextDouble();
	//더하기 double sum2
	//뺴기 double sub2
	//곱하기 double mul2
	//나누기 double div2
	
	public static void mathod4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("num7 숫자를 입력하세요 :(");
	
	double num7 = sc.nextDouble();
	
	System.out.println("num8 숫자를 입력하세요 ");
	
	double num8 = sc.nextDouble();
	
	//시스템 호출 문구를 먼저 삽입후에 값을 넣을수있도록 **!
	//system out후에 double num 7의 코딩을 기입해서 
	//순서를 꼬이지 않도록 한다 **!
	double sum2 = num7 + num8;
	double sub2 = num7 - num8;
	double mul2 = num7 * num8;
	double div2 = num7 / num8;
	
	System.out.println("sum2 : " + sum2);
	System.out.println("sub2 : " + sub2);
	System.out.println("mul2 : " + mul2);
	System.out.println("div2 : " + div2);
	
	}
	public static void main(String[] args) {
	//매서드 중에서 출력하고싶은 메서드만 작성할것 
	//만약에 mathod1() 안에 작성한 내용을 출력하고싶을때
	//mathod1()을 작성후에 출력하면 나온다
		
	mathod1();
	
	mathod2();
	
	mathod3();
	
	mathod4();
	
	
		
		
		
		
		
	}

}
