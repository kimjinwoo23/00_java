package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	ArrayList<Book> list = new ArrayList<>();
	
	public BookController() {
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
		
	}
	
	//책 전체보기

	public void selectList() {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다");
		//만약에 책이있다면 목록을 보여주기
		}else {
			for(Book b : list) {
				System.out.println(b);
			}
		}
		
		
		
		
		
	}
	
	//책 검색하기
	public void searchBook(String keyword) {
		List<Book> result = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)|| b.getAuthor().contains(keyword)) {
				result.add(b);
				
			}
		}
		if(result.isEmpty()) {
			System.out.println("검색결과가 없습니다");
		}else {
			for(Book bb : result ) {
				System.out.println(bb);
			}
		}
	}
	
	//도서 삭제기능ㅇ 추가 
	public void deleteBook(String title,String author) {
		//true false를 통해 삭제가됐는지 안됐는지 확인
		boolean removed = false;
		//책 제목과 저자를 검색해서 삭제할 책 찾기 
		//전체목록 
		for(Book bbb :  list) {
			if(bbb.getTitle().equals(title) &&  bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				removed = true;
				break;
			}
		}
		//만약에 삭제가 됐다면 삭제된걸 true false 로 표기하기
		if(removed) {
			System.out.println("도서삭제가 완료되었습니다");
		}else {
			 System.out.println("해당하는 도서가 없습니다");
		}
		
	}
	public void ascBook() {
		//for,while short 오름차순 정렬을 해주면 가능(대신코드가 길어짐)
		//sort = 목록을 정렬한다
							//정렬하는 기준           책에서 	책제목
							// :: = Book파일에 getTitle을 참조해서 사용한다 
		Collections.sort(list,Comparator.comparing(Book :: getTitle));
		
		
	}
	
	
	
	
	
	
	
	
}
