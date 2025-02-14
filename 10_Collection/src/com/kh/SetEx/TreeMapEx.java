package com.kh.SetEx;

import java.util.TreeMap;

/*
 TreeMap이진검색트리 데이터 검색 삽입 삭제 연산을 빠르게 가능 
 키 - 값 (Key - value)저장하는 자료 구조 
 키를 기준으로 정렬해서 저장 
 
 메서드 
 put(key , value) : TreeMap에 키-벨류 추가 
 get(key)		  : 저장된 키에있는 벨류 값을 전달
 containskey(key):키가포함되었는지 확인
 containsvalue(value):값가포함되었는지 확인
 remove(key)		:지정된 키와 값을 삭제
 size()				:키-값의 개수반환
 isEmpty()			:비어있는지 확인
 clear()			:모두 제거 
 
 
 
 
 
 */
public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		tm.put(1, "one");
		tm.put(2, "two");
		tm.put(3, "three");
		
		//한번에 작성하고싶다면
		Integer[] keys = {1,2,3};
		String[] values = {"one","two","three"};
		
		for(int i =0; i <keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		//Map또한 키 중복 x 벨류가 다를경우 맨밑에 작성한 벨류가덮어씌워짐
		
		
		System.out.println(tm);
		
		//get으로 값 가져오기
		System.out.println(tm.get(2));
		
		//remove로 값 제거
		tm.remove(3);
		System.out.println(tm );
		
		//containskey메서드로 키가있는지 확인
		System.out.println(tm.containsKey(1));
		
		System.out.println(tm.size());
		
		System.out.println(tm.isEmpty());
		tm.clear();
		System.out.println(tm);

		
	}
	
	
	
	
	
	
	
	
}
