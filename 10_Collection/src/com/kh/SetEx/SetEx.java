package com.kh.SetEx;

import java.util.HashSet;

/*
 Set(집합,주머니)
 순서를 유지하지않음
 중복데이터 저장x (같은게들어오면 덮어쓰기)
 
 set 1.HashSet : 처리 속도가 빠른 set 
 	 2. LinkedHashSet : 순서를 유지하는 set 
 	 3.Treeset : 자동정렬되는 set 
 	 
 	 HashSet 사용예제 
 	 사용 조건 1 : 객체의 equals()가 오버로딩되어있어야함
 	 사용 조건 2 : 객체의 hashcode()가 오버로딩 되어있어야함
 	 
 	 Set<자료형> 셋 = new HashSet<>();
 	 HashSet<자료형> 해쉬 = new HashSet<>();
 	 
 */
public class SetEx {
	//중복을 허용하지않고 각 값을 저장하는것을 생성해서 
	//데이터 중복 확인 많이 사용
	HashSet<String> set = new HashSet<>();{
		set.add("로맨스");
		set.add("스릴러");
		set.add("판타지");
		set.add("액션");
		System.out.println(set);
		//set자리는 랜덤이고 특정하게 배정된 자리가없음
		set.remove("로맨스");
		 System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set.contains("판타지"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
