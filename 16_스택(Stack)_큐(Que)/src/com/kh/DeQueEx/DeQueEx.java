package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 DeQue(덱): 양쪽 끝에서 삽입과 삭제가 모두가능
 스택 + 큐의 기능을 모두 제공하고 양방향으로 데이터를 추가하거나 제거
 
 메서드 
 addFirst():맨앞에 값을 추가
 addLast():맨 뒤에 값 추가 
 removeFirst():맨 앞 값 제 거 
 removeLast(): 맨 뒤 값 제 거 
 getFirst(): 맨 앞의값이 무엇인지 확인 
 getLast(): 맨뒤의 값을 확인하고 제거하지않음 

DeQue 인터페이스기 떄문에 ArrayDeque로 된 객체를 이용해서 공간생성 


 */
public class DeQueEx {

	public static void main(String[] args) {
		//Deque 생성 
		Deque <Integer> deque = new ArrayDeque<>();
		
		// 맨 앞에 값 추가 
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		System.out.println(deque);
		
		// 맨 뒤에 값 추가 
		deque.addLast(4);
		deque.addLast(5);
		deque.addLast(6);
		System.out.println(deque);
		
		deque.removeFirst();
		System.out.println(deque);
		
		deque.removeLast();
		System.out.println(deque);
		
		int a = deque.getFirst();
		System.out.println(a);
		
		int b = deque.getLast();
		System.out.println(b);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
