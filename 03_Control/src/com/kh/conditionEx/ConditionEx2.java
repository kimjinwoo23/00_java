package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	

/*
if - else if - else
사용 방법 
if(조건1) {
	조건이 참일경우 실행할 코드 작성 
	
}else if(조건 2) {
조건1이 거짓이고 조건 2가 참일 경우 실행할 코드 작성  

}else{


조건 1과 조건 2가 모두 거짓일경우 실행할 코드 작성 
}
*/
//만약에 돈이 2000원 이상 있을 경우 택시를 탄다 
//그런데 돈이 1500~1900원 이하 일 경우 대중교통을 탄다
//만약에 돈이 없을경우 걸어간다 

public static void main(String[] args) {
	//method1();
	//method2();
	//method3();
	//method4();
	method5();
}
//method2
//나이를 입력받아서 13세 이하면 어린이 
//13 세 초과 18세 이하면 청소년 
//18세 초과 성인 

//method3
//달을 입력해서 해당하는 계절 출력하기 
//봄: 3,4,5 여름: 6,7,8 가을:9,10,11 겨울:12,1,2

public static void method1() {
	

	int money = 1800;//내가 현재 가지고 있는 돈 
	if (money>=2000) {
		System.out.println("택시를 탄다 ");
	}else if(money>= 1500 && money <= 1900){
		System.out.println("대중교통을 이용한다 ");
	}else {
		System.out.println("걸어간다 ");
	}
	

	
	

	
	
	
}

public static void method2() {
	
Scanner sc = new Scanner(System.in);
System.out.println("나이를 입력하세요 : ");
int age = sc.nextInt();
if (age <= 13) {
	System.out.println("어린이입니다 ");
}else if( age < 18) {
	System.out.println("청소년 입니다 ");
}else {
	System.out.println("성인입니다 ");
}


	

}

public static void method3() {
	Scanner sc = new Scanner(System.in);
	System.out.println("오늘은 무슨 달 인가요 ? : ");
	int f = sc.nextInt();
	
	String result;
	if(f<=5 && f>=3) {
		result ="봄";
	}else if(f>=6 && f<=8) {
		result ="여름";
	}else if (f>=9 && f<=11) {
		result ="가을";
	}else if(f ==1 || f==2 || f== 12) {
		result ="겨울";
	}else { 
		result = "잘못 입력된 달 입니다 ";
		
	}
		System.out.println(result);
}

public static void method4() {
	//13세 이하 어린이 14~18 청소년 19이상 성인 
	int age = 5;
	//변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
	String result;
	if(age <= 13) {
		result = "어린이";
	}else if(age >=14 && age <=18) {
		result = "청소년";
	}else {
		result = "성인";
	}
	System.out.println(result + "입니다 ");
}

public static void method5() {
	//키 몸무게를 double로 입력받고 bmi지수를 계산해서 
	//결과에 따라 저체중,정상체중,과체중,비만을 출력하세요
	//bmi 18.5미만-저체중 185이상 23 미만 정상체중 
	//23이상 25미만 과체중 25이상 30 미만 비만 
	Scanner sc = new Scanner(System.in);
	System.out.print("키가 몇인가요? : ");
	double a = sc.nextDouble();
	System.out.print("몸무게가 몇인가요? : ");
	double b = sc.nextDouble();
	double c = b/(a*a);
	System.out.println("bmi는 : " + c);
	
	String  result;
	if (18.5>c) {
		result = "저체중";
	}else if(c >= 18.5 && b > 23){
		result= "정상체중";
	}else if(c > 23 && b < 25) {
		result= "과체중";
	}else {
		result= "비만";
	}
	System.out.println(result + "입니다 ");
}
	public static void practice5() {
		//중간 기말 과제 출석입력 받기 
		Scanner sc = new Scanner(System.in);
		System.out.println("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.println("기말 점수 : ");
		double fi = sc.nextDouble();
		System.out.println("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.println("출석 횟수 : ");
		int attend = sc.nextInt();
		
		//출석비율 계산 
		double attendper = (double)attend / 20*100;
		//평가 비율에 따른 총 점 계산 
		//중간 20 기말 30 과제 30 출석 20 
		double midscore = mid*0.2;
		double fiscore = fi * 0.3;
		double assigscore = assig * 0.3;
		//20*100과 0.2 한 attend의 값은 같다
		double attendscore=attendper*0.2;
		double totalscore = midscore + fiscore + assigscore+attendscore;
		//평가에 따른 pass 또는 fail출력 
		if(totalscore >= 70 && attendper >= 70) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		System.out.println("중간고사 점수 (20점 만점)" + midscore);
		System.out.println("기말고사 점수 (30점 만점)" + fiscore);
		System.out.println("과 제  점수  (30점 만점)" + assigscore);
		System.out.println("출 석  점수  (20점 만점)" + attendscore);
		System.out.println("   총   점    " + totalscore);
		
	}
}


