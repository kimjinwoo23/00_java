package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController() {
		
	}
	public void mainMenu() {
		System.out.println("1.도서 추가 저장");
		System.out.println("2.저장 도서 출력");
		System.out.println("9.프로그램 끝내기");
		System.out.println("프로그램 종료");
		
		switch() {
		case 1: 
			//도서 저장
			break;
		case 2: 
			//저장 도서 출력 
			break;
		case 9:
			return;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
		
		
	}
	
	
}
