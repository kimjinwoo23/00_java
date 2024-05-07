package com.kh.conditionEx;

import java.util.Scanner;

public class ControlPre {

	
	public static void practice1() {
		//키보드로 입력받은 정수가 양수이면서 짝수일때만 
		//짝수입니다를 출력하고 짝수가 아니면 
		//홀수입니다 를 출력하세요 
		//양수가 아니면 양수만 입력해주세요를 출력하세요 
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
		if(num > 0) { // +
			if (num % 2 == 0)  {
				
				
				System.out.println("짝수입니다. ");
			}else {
				System.out.println("홀수입니다. ");
			}
		} else {
			System.out.println("양수만 입력해주세요 ");
		}
	}
	
	
	public static void practice2() {
		//국어 영어 수학 세 과목의 점수를 키보드로 입력하고 
		//합계와 평균을 계산후에 합격 불합격을 처리하시오 
		//합격기준 : 세과목의 점수가 각각 40점 이상이면서 
		//평균 60점을 넘을떄 
		//합격했을경우 과목 별 점수와 합계 평균 축하합니다 
		//합격입니다! 를 출력하고 불합격인 경우 
		//불합격입니다를 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 ");
		int k = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 ");
		int m = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 ");
		int e = sc.nextInt();
		
		//합계와 평균 계산
		int t = k+m+e;
		double a = (double)t/3.0;
		//합격 여부 판별 
	
		if(k >=40 && m>=40 && e>=40 && a>=60);{
			System.out.println("국어점수 : "+ k);
			System.out.println("수학점수 : "+ m);
			System.out.println("영어점수 : "+ e);
			System.out.println("합계 : " + t);
			System.out.println("평균 : " + a);
			System.out.println("합격입니다 ");
		}
		 {
		    System.out.println( "불합격입니다");
		}
		
		
			
	
		
	}
			
	public static void practice3() {
		/*
		 1~12사이에 수를 입력받아 해당달의 일수를 출력하세요
		 2월 윤달은 생각하지않는다 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 12중 하나 입력 : ");
		int month = sc.nextInt(); //키보드로 입력하는 달 
		
		int daymonth; //해당하는 달의 일수 
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			daymonth = 31;
			break;
		case 4 : case 6 : case 9 : case 11 : 
			daymonth = 30;
			break;
		case 2 : 
			daymonth = 28;
			
		default : 
			System.out.println(month + "월은 존재하지않습니다 ");
			//daymonth = 0;
			return;
			}
		System.out.println(month + " 월은 " + daymonth + " 일까지 있습니다");
		}
		
			
	public static void practice4() {							
		
		
		
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
	}

}
