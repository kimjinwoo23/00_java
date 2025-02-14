package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	//메인메뉴 만들기
	public void mainMenu() {
		while(true) {
			System.out.println("도서관리프로그램~");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서전체목록 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 삭제");
			System.out.println("5.도서 정렬");
			System.out.println("6. 종료 ");
			System.out.print("메뉴선택해주세요");
			int menu = sc.nextInt();
			sc.nextLine();
			
		switch(menu) {
		case  1:
			insertBook();	
			break;
		case 2: 
			selectList();
			break;
		case 3 : 
			searchBook();
				break;
		case 4 : 
			deleteBook();
				break;
		case 5:
			ascBook();
			break;
		case 6:
			System.out.println("프로그램을 종료합니다");
			return;
		default:
			System.out.println("잘못된선택입니다");
				
			}
		}
			
	}	
	
	public void selectList() {
		bc.selectList();
		
	}
	
	//책 추가하기위해 키보드로 작성하는 insertBook void 만들기
	public void insertBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(title,author,category,price);
		bc.insertBook(book);
		System.out.println("도서추가가 완료되었습니다");
		
	}
	//도서검색
		public void searchBook() {
			System.out.print("검색할 키워드 입력");
			String keyword = sc.nextLine();
			bc.searchBook(keyword);
		}
	//도서삭제
	public void deleteBook() {
		System.out.print("삭제할 도서목 록: ");
		String title = sc.nextLine();
		System.out.print("삭제할 도서 저자");
		String author = sc.nextLine();
		
		//BookController 도서 삭제기능 추가 
		bc.deleteBook(title,author);
		
	}
		
	//도서목록을 오름차순 정렬
	//ascending = 오름차순
	public void ascBook() {
		//BookController 도서오름차순 정렬 기능추가 
		bc.ascBook();
		
		
	}
		
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

