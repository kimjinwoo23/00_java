package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {

	/*
	 while 문을 사용해서 4번을누르면
	 프로그램을 종료하는 코드를 작성
	 */
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		//1. 게임하기 2. 수영하기 3.잠자기 4.프로그램 종료 
		while(true) {
		System.out.println("원하는 프로그램 번호를 입력하세요");
		System.out.println("1. 게임하기 2. 수영하기 3.잠자기 4.프로그램 종료 ");
		int menu = sc.nextInt();
		
		
			
			switch(menu) {
			case 1 : 
				System.out.println("게임하기");
				break;
			case 2 : 
				System.out.println("수영하기");
				break;
			case 3 : 
				System.out.println("크아아아악");
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				return;
				default : 
					System.out.println("잘못된 입력입니다");
				
				
				
			}
			
			
			
		}
		
	}
	
	public static void cafe() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("카폐에 오신걸 환영합니다\n"
				+ "원하는 메뉴를 입력해주세요\n"
				+ "1.아메리카노\n"
				+ "2.카페라떼\n"
				+ "3.녹차\n"
				+ "4.흑당버블티\n"
				+ "5.주문취소 ");
		
		String menu = sc.next();
		
		switch(menu) {
		case  "1" : case  "아메리카노":
			System.out.println("아메리카노 주문 추가 되었습니다");
		break;
		
		case  "2" : case  "카페라떼":
			System.out.println("카페라떼 주문 추가 되었습니다");
		break;
		
		case  "3" : case  "녹차":
			System.out.println("녹차 주문 추가 되었습니다");
		break;
		
		case  "4" : case  "흑당버블티":
			System.out.println("흑당버블티 주문 추가 되었습니다");
		break;
		
		case "5" : case "주문취소":
			System.out.println("주문이 취소되었습니다");
			return;
			
		default :
			System.out.println("잘못된 입력입니다");
		}
		
		
	}
	}
	
	public static void money() {
		//커피 10잔 커피값 300원 
		int coffee = 10;
		int money = 300;
		//만약에 0보다 많다면 커피를
		//구매하고 커피가 다 떨어지면 판매를 중단한다
		
		while(money >0) {
			System.out.println("돈을 받았으니 커피를 제공");
			coffee--;
			System.out.println("남은 커피의 양은 "+ coffee + "잔 입니다");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피가 매진입니다");
				return;
			}
			
			
			
			
			
		}
		
		
		
	}
	
	public static void Numbers() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++;	
		}
		
	}

	public static void tree() {
		//나무 10번찍으면 나무 다운
		int hit = 0;
		while(hit < 10) {
			//나무 몇번히트했는지 확인
			hit++; 
			System.out.println("나무를 " + hit + "번 찍었습니다");
			//히트가 10번되면 넘어갑니다 표현 
			if(hit==10) {
				System.out.println("나무가 넘어졌습니다");
			}
			}
}
	
	
	//사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의
	//숫자를 모두 출력 단 입력한수는 1보다 크거나 같아야함 
	//만약에 1미만의 숫자가 입력돼면 1이상의 숫자를 입력해주세요 출력
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력해주세요");
		int num = sc.nextInt();
		int abc = 1;
		
		
			
			System.out.println();
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			
		}else {
			System.out.println("1부터 " + num + "까지의 숫자들");
			
			//while 문을 사용해서 숫자 모두 출력하기
			while(abc<=num) {
				System.out.println(abc);
				abc++;
		}	
		}	
	}
	
	//커피가 100원 돈이없으면 구매하지못하는 경우
	public static void coffee() {
		Scanner sc = new Scanner(System.in);
		int coffeeprice = 100;
		System.out.println("카폐에 오신걸 환영합니다 ");
		System.out.println("현재 금액을 적어주세요");
		int money = sc.nextInt();
		
		
		while(money<coffeeprice) {
			System.out.println("잔액이 부족합니다 돈을 더 넣어주세요");
			System.out.println("금액을 입력해주세요");
			int num = sc.nextInt();		
			if(money > coffeeprice) { 
				System.out.println("커피를 구매하셨습니다 거스름돈은 " 
							+ (money - coffeeprice)+"입니다 \n");
			}
		}
		
		
		
	}
	
	//10000원 이상 돈이없을경우 탕수육을 시키지못함
	public static void lovepork() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 금액을 입력해주세요");
		int money = sc.nextInt();
		int pork = 10000;
		
		if(money<pork) {
			System.out.println("금액이 부족합니다");
		}else {
			System.out.println("주문이 완료되었습니다 "+ "현재 잔액은 " 
		+ (money-pork) + "입니다\n");
		}
		
		
		
	}
		
	/* public : 어디서든 접근 가능한
	   protected : 같은 폴더 안에서만 접근가능 
	   default : 같은 폴더 안에서 접근가능  protected보단 제한되게 접근함
	   private : 한 클래스 안에서만 접근가능 
	   void : 반환하는 것 없이 바로 출력이 될 때 사용
	   
	*/
	public static void main(String[] args) {
		//method1();
		//cafe();
		//money();
		//Numbers();
		//tree();
		//method2();
		//coffee();
		lovepork();
		
	}

}
