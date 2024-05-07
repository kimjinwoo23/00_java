package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	/*
	 while(조건식) : 끝이 확실하지않은 반복에 사용 
	 
	 while(조건식이 참일경우) {
	 
	 조건식이 참일경우에 실행 
	 }
	 조건식이 거짓인경우에 실행종료
	 
	 예제 코드 1: 
	 while(true){
	 system.out.println("무한반복");
	 }
	 예제 코드 2: 
	 while(false){
	 system.out.println("실행하지못한 채로 종료 );
	 */
	
	
	public static void inloop() {
		while(true) {
			System.out.println("무한 실행");
		}
	}
	public static void outLoop() {
		//while(false) {
			//System.out.println("실행안됨");
		}
	
	public static void whileLoop() {
		//조건 = 숫자가 3이상이면 거짓
		int i = 1;
		while(i<=2) {
			//조건이 참일떄 실행할 코드 
			System.out.println("i의 값 : " + i);
			i++;
		}
	}
	
	public static void whileLoopEx() {
		//스캐너 활용해서 값 입력받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 실행 2. 종료 ");
			System.out.println("원하는 숫자를 입력하세요 : ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("프로그램을 실행합니다 ");
				break;
			case 2 : 
				System.out.println("프로그램을 종료합니다");
				//break;
				return;
				//break 와 return 모두 case를 탈출하는 구문이기 떄문에 
				//같이 사용할수가 없다 
				//break는 while문에서 계속 반복된다
				//return의 경우 while이 트루여도 while코드를 탈출한다
				default : 
					System.out.println("잘못된 번호입니다 ");
					System.out.println("1. 실행 2. 종료 ");
					System.out.println("원하는 숫자를 입력하세요 : ");
				
				
			}
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		//inloop();
		//whileLoop();
		whileLoopEx();
		
	}

}
