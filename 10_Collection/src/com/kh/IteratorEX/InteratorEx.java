package com.kh.IteratorEX;

import java.util.ArrayList;
import java.util.Iterator;

/*
 Collection(List,Set,Map )반복하는데 사용
 Enumeration :더이상 권장하지않음 vector와같은 예전 클래스에서만 사용
 
 Interator :반복하는데 사용 ( 순차적으로 회전 ) 	
 			읽기만가능 , 추가하거나 삭제할수없음
 			
 ListIterator:Iterator업그레이드 버전 
 			List(vector, ArrayList ,LinkedList)컬렉션에서만 사용 
 			양방향으로 순차적으로 회전할수있음
 			양방향으로 순회하는것은 = 앞뒤로 이동가능 
 			추가하거나 삭제 가능 
 			
 Interator 밑에있는 메서드 
 	hasNext():다음이 있는지 없는지 확인 true false
 			만약에 존재한다면 true 하지않는다면 false
 	Next(): 다음것을 가지고오는데 사용 
 		    next()는 사용하기전에 hasNext 를사용해서 그 다음이있는지 없는지 확인하고 
 		    next()를사용하는것이 안전함

 */
public class InteratorEx {

	public static void main(String[] args) {
		
		ArrayList<String>과일들 = new ArrayList<>();
		과일들.add("사과");
		과일들.add("블루베리");
		과일들.add("패션후르츠");
		과일들.add("망고");
		
		//Interator생성
		Iterator<String> 반복 = 과일들.iterator();
		
		//hasNext() 다음 값이 있는지 확인 = true false
		while(반복.hasNext()) {
			//next()로 다음값 가지고오기
			String 과일 = 반복.next();
			System.out.println(과일);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
