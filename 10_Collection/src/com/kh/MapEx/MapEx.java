package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*

   ┌HashMap		 : 빠른검색속도(가장많이사용)
Map├TreeMap		 : 정렬된 데이터를 필요할경우 사용 
   └LinkedHashMap: 순서를 유지하면서 저장하기떄문에 순서가 중요한경우

 Map:특정 키를 입력하면 해당되는 값을 얻을수있는 Collection객체
 키 = key
 값 = value 
 key:value값으로 구성
 
 메서드 
 	put(key,value):지정된 키와,값의 쌍을 추가
 	get(key)      :지정된 키에 저장된 값을 보여줌
 	containsKey(key) : 지정된 키가 존재하는지 확인
 	containsValue(value):지정된 값이 존재하는지 확인
 	remove(key):지정된 키와 키에 저장된 값을 제거 
 	keySet() : 키를포함하는 집합을 반환 
 	values() : 모든값들을  컬렉션 반환 
 	entryset() : 모든 키-쌍을 포함하는 집합을 반환 
 	
 
 
 
 */
public class MapEx {

	public static void main(String[] args) {
		//Map생성
		Map<String,Integer> 학생 = new HashMap<>();
		//put 을 활용해서 값 추가하기 
		// .추가하기(key , value);
		학생.put("철수", 90);
		학생.put("영희", 85);
		학생.put("민수", 88);
		
		//전체보기
		System.out.println(학생);
		
		//get을 사용해서 조회하기
		System.out.println("철수의 성적은 : " +학생.get("철수"));
		
		//remove를 사용해서 삭제하기
		학생.remove("영희");
		
		//전체보기
		System.out.println("전체 학생 : " + 학생 );
		
	
		//key는 유일해야함 값이 중복될수없음 가장 마지막 값으로 덮어씌워짐
		학생.put("철수", 80);
		
		//학생들 성적 출력하기
		//for-each
		for(String 이름 :  학생.keySet()) {
			//각 학생의 성적 조회
			int 성적 = 학생.get(이름);
			System.out.println(이름 + " 학생의 성적은 : " + 성적);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
