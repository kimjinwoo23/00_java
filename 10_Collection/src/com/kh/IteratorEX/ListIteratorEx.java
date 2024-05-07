package com.kh.IteratorEX;

import java.util.*;

/*
 ListIterator
 Next는 앞에서부터(높은수) 순차적으로 출력
 previous는 뒤에서부터(낮은수) 순차적으로 출력
 hasNext()		:다음값이 존재하는지 true false로 확인
 next()		    : 다음값 가져오기 
 hasPrevious()  : 이전 값이 존재하는지 true false로확인
 previous()		: 이전 값 가져오기 
 
 값을 추가하거나 삭제할수있음
 add() : 추가
 remover : 삭제 
 
 */
public class ListIteratorEx {

	
	public static void main(String[] args) {
		
		ArrayList<String> 색상들 = new ArrayList<>();
		색상들.add("빨강");
		색상들.add("화이트");
		색상들.add("초록");
		
		//리스트 이터레이터 생성
		ListIterator<String> 반복하기 = 색상들.listIterator();
		
		System.out.println("앞에서부터 출력");
		while(반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상);
			
			
		}
		System.out.println("뒤에서부터 출력");
		while(반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상);
			
			
	}
		System.out.println("add 를 사용해서 추가하기 ");
		반복하기.add("파랑");
		//add해서 값을 추가할경우 앞에서 추가됨
		
		System.out.println(색상들);
		
		반복하기.previous();
		반복하기.remove();
		
		System.out.println("삭제됐는지 확인 : " + 색상들);
		//System.out.println(색상들);
		//에러남
		//add값을 추가하면 앞으로 이동하면서 리스트 끝에 위치하고 
		//더이상 다음이없기떄문에 삭제 불가능 
		//해결방안은 next를 호출해서 위치를 바꾸고 remove를 쓰거나 
		//previous를 호출해서 위치를 바꾼후에 remove사용
		
	}
}
	
	
	
	
	
	
	
	

	

