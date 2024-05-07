package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

/*
 Queue
 먼저 추가된항목이 먼저 제거 
 First-In First-Out :먼저 추가된 항목이 가장먼저 제거 
 데이터가 줄을 서있는 것과 유사하며, 가장먼저 들어간 항목이 가장 앞에위치함
 대기,이벤트 처리 
 
 메서드 
 offer : 큐에 공간이충분한 경우 값이 추가되고 , 추가되면 true를반환 
 추가되지못하면 예외
add를 사용할수있지만 offer와 마찬가지로 공간이없으면 예외처리됨
poll : 값을 제거하고 반환 만약 비어있는경우 null을 반환 
remove: poll과 동일한 기능을 수행하지만 비어있는경우에는 예외를 던짐 
peek: 맨 앞에있는 값을 반환하지만 제거하지는 않음 
element: peek 처럼 맨앞에있는 값을 반환하지만 제거하지는않음 단 비어있는경우 예외를던짐 
 
 
 */
public class QueEx {

	public static void main(String[] args) {
		//Queue 인터페이스 이기 떄문에 직접 Queue Queue을 사용할수없음 
		//Queue LinkedList로 사용해서 많이 작성 
		
		Queue<Integer> 큐 = new LinkedList<>();
		
		큐.offer(1);
		큐.offer(2);
		큐.offer(3);
		
		//큐에서 맨 앞 데이터를 확인 제어 
		int 맨앞 = 큐.poll();
		 System.out.println(맨앞);
		 
		 int 데이터확인 = 큐.peek();
		 System.out.println(데이터확인 );
		 
		 boolean isEmpty = 큐.isEmpty();
		 System.out.println("비어있나요? " + isEmpty);
		
		
	}
	
	
	
	
	
	
	
	
	
}









