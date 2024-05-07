package com.kh.loop.ex;

public class LoopFor {
	/*
	 for문: 끝이 정해져있는 반복을 진행할떄 사용하는 제어문 
	 특정조건으 만족하는동안 {} 괄호안에 코드블록을 반복해서 실행
	 반복횟수가 일정하게 정해진 경우 많이사용
	 사용 예제는 
	 for (초기식 ; 조건식 ; 증감식 ) {
	 //조건이 맞을경우 반복해서 실행될 코드 블록 
	 } for문에서 조건이 맞지않으면 for문을 탈출
	 
	 for-each문 
	 배열이나 반복가능한 모든 값에 대해 반복적으로 작업할떄 사용하는 반복문
	 조건과 반복이 처음부터 끝까지 모두 반복하고 
	 사용예제 
	 
	 for(자료형 변수명 생성: 배열/반복해서 보여주고자하는 변수명 ) {
	 	실행하고자 하는 작업 작성
	 	system.out.println(생성된 변수명 작성);
	 }
	 
	 
	 */

	public static void main(String[] args) {
		//int i = 1; for문 안에 int 값 넣기
		//for(초기 식의 값이기 때문에 i라고 작성이 안되고
		//for(지정값 변수명 =변수의 초기 값; 조건; 증감식)
		//for ( i ; i <= 2 ; i++)
		//system.out.print("i의 값 : " + i)
		for (int i = 1 ; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("========for문 2번 ========");
		
		for ( int a = 1; a<= 3; a++) {
			System.out.println(" a의 값 : " + a );
		}
		System.out.println("=====for문 3번 =====");
		
		for (int num = 1; num<=5; num++) {
			System.out.println("num의 값 : " + num);
		}
		System.out.println("=====for문 4번 ====== ");
		
		for (int num = 2; num <= 10; num+=2) {
			System.out.println("num의 값 : " + num);
			
		//for 문 구구단 5단 출력하기 
		 int dan = 5;
		 for(int i = 1; i<=9; i++)
			System.out.println(dan + "단 * "+ i + " = " + (dan*i));
		}
		
		System.out.println("======for 6 ======");
		//구구단에서 3단을 9번까지 출력하기
		int dandan = 3;
		for(int i = 1; i <=9; i++) {
			System.out.println(dandan + "단 * " + i + " = " + (dandan*i));
		}
		
		
	}
	
	
	

}
