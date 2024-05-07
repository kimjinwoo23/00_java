package com.kh.array.List.ex;

import java.util.ArrayList;

/*
 	ArrayList 
 	리스트는 배열과 비슷하지만 크기가 제한이없어서 다르다
 	원하는 만큼 담을수있음
 	
 	ArrayListEx로 이름 ArrayList로 사용하지말것
 	
 	ArrayList<자료형> 변수명 = new ArrayList<자료형>();
 	int ->Integer
 	String ->String 
 	double->Double 
 	
 	
 	add 추가
 	get 반환
 	set 수정 
 	remove 삭제 
 	size 개수확인 
 	isEmpty 비어있는지 확인
 	clear 모두 삭제 
 	
	*/
public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>num = new ArrayList<Integer>();
		//index 자리위치 0 
		
		//자리가 비어있기 떄문에 true
		 System.out.println(num.isEmpty());
		 
		//숫자 추가 
		num.add(10);
		
		System.out.println("추가 확인 " + num.get(0));
		
		System.out.println(num.isEmpty());
		
		//크기확인 
		System.out.println(num.size());
		
		//set: 수정 0의 위치를 어떻게 수정할건지 null: 값
		//		key value
		num.set(0, 20);
		System.out.println("수정 후 "+num.get(0));
		
		//삭제하기 
		num.remove(0);
		
		System.out.println(num.isEmpty());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
