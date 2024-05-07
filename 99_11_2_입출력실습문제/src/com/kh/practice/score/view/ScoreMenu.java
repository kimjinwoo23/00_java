package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 점수 저장");
			System.out.println("2. 점수 출력");
			System.out.println("3. 종 료 ");
			System.out.println("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				//점수저장 
				break;
			case 2: 
				//점수보기
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				return;
			default : 
				System.out.println("잘못된 입력입니다 ");
			}
			
		}
	}
	public void saveScore() {
		System.out.print("이름입력 : ");
		String name = sc.nextLine();
		System.out.println("국어점수 입력 ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력 ");
		int eng = sc.nextInt();
		
		
		
	}
	
	
	
	
	
	
	
}
