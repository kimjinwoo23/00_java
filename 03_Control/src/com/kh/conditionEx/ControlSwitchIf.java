package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	
	public static void takeAtaxi() {
		//입력받은 돈이 3천원 이상일 경우에만 택시를 타는지 물어보기
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유중인 금액을 입력하세요 : ");
		int money = sc.nextInt();
		//if 문으로 3천원 이상일 떄만 물어보는 코드작성 
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예,아니요)");
			String answer = sc.next();
			//answer 로 받는 응답에 따라 대답 처리
			
			switch (answer) {
			case "예": 
				System.out.println("택시를 탔습니다");
				break;
			case"아니요":
				System.out.println("택시를 타지 않습니다");
				break;
			default : 
				System.out.println("잘못된 입력입니다 ");
				
			}
		}else {
			System.out.println("3천원 이하여서 잔액이 부족합니다");
		}
		
		
		
		
		
	}
	
	
	//사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램작성
	//90이상 a 80이상 b 70이상 c 60 이상 d 60점 미만 f
	//f학점일때 재수강 하시겠습니까 (yes/no)창 만들기
	
	public static void whyscore() {
			Scanner sc = new Scanner(System.in);
			System.out.print("점수를 입력해주세요 :");
		int score= sc.nextInt();
		if(score >= 90) {
			System.out.println("A학점입니다");
			
		}else if(score >= 80) {
			System.out.println("B학점입니다");
			
		}else if(score >= 70) {
			System.out.println("C학점입니다");
						
		}else if(score >= 60) {
			System.out.println("D학점입니다");
			
		} else{
			System.out.println("F학점입니다");
		//마지막 else에는 조건 설정을 못하고 그 값에 미달하는거에 해당.
			
			//시스템 호출후에 String 으로 스캐너 설정 
			//그 후에 스위치 변수 설정
			
			System.out.print("재수강 하시겠습니까? (yes/no) ");
			String reScore = sc.next();
			switch(reScore) {
			
			case "yes" : case "YES":
				System.out.println("재수강입니다");
				break;
			case "no" :
				System.out.println("재수강 신청이 되지않았습니다");
				break;
			default : 
				System.out.println("다시 입력해주세요 ");
				return;
			}
			
		}	
		
	}
	
	public static void whatday() {
		//오늘은 어떤 요일인지 확인후에 요일에 따른 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요 ");
		System.out.print("(월/화/수/목/금/토/일) : ");
		String day = sc.next();
		
		String result;//따로 요일에 무슨 운동을 할건지 출력하고싶을떄
		//case에 해당하는 system프린트를 지우고 result;
		//로 바꿔서 default밑에 
		//System.out.println(day+ "요일"+result+"할 예정");
		//로 마지막에 리턴까지 추가해주기
		
		switch(day) {
		case "월" : case "수": case "금":
			System.out.println("헬스를 할 예정입니다. ");
			break;
		case "화": case "목": 
			System.out.println("공부를 할 예정입니다. ");
			break;
		case "토": case"일":
			System.out.println("오늘은 집에서 숼 예정인가요? (예/아니요) ");
			
		String answer = sc.next();
		
		if(answer.equals("예")) {
			System.out.println("집에서 숼 예정입니다. ");
		}else {
			System.out.println("어떤 활동을 할 계획인가요? ");
			System.out.print("1.등산 / 2.독서 / 3.수영");
		int activity = sc.nextInt();
		switch (activity) {
		case 1 :
			System.out.println("등산");
			break;
		case 2 :
			System.out.println("독서");
			break;
		case 3 : 
			System.out.println("수영");
			break;
		default : 
			System.out.println("잘못된 입력입니다. ");
			
			
			
			}
		}
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		//takeAtaxi();
		whyscore();
		
		
	}

}
