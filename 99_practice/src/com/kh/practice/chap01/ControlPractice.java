package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void Practice11() {
		//정수를 이용해서 4자리 비밀번호 만들기 
		Scanner sc = new Scanner(System.in);
		
		//비밀번호를 만족할떄 까지 출력 (반복)
		while(true) {
		//4자리 정수를 입력받아서 각 자리수의 중복되는값이
			System.out.println("비밀번호를 입력(1000~9999) : ");
			int password = sc.nextInt();
			//입력된 정수가 4자리인지 확인해보자
			if(password<1000 || password > 9999) {
				System.out.println("4자리가 아닙니다");
				System.out.println("자릿수가 안맞음");
				continue;
			}
			//자리값 
			int[]digits = new int[4];
			digits[0] = password / 1000; 	   //천의자리
			digits[1] = (password / 100) % 10; //백의자리
			digits[2] = (password / 10) % 10;  //십의 자리
			digits[3] = password % 10; 		   //일의자리
		
			
			//중복 여부 확인 
			boolean isTrue = true;
			//length = 크기 
			for(int i = 0; i < digits.length; i++) {
				for(int j= i+1; j < digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
				}
				if(!isTrue) {
					break;
				}
			//없을경우 성공 중복값이 있으면 중복값 있음을 출력
					if(!isTrue) {
						System.out.println("중복값이 있음");
					}else {
						System.out.println("비밀번호 생성 성공");
						break;
					}
				
			}
		
		//자릿수가 안맞으면 자릿수안맞음을 출력하기
			
		//단. 제일 맨 앞자리수의 값은 1부터 9사이의 정수 
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
