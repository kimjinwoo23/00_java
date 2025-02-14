package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	//기본 생성자 
	public MapPre() {
	}
	public void practice1() {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
		
	}
	public void practice2() {
											//값을 안넣어도됨
		Map<String,String> map = new HashMap<String,String>();
		//map.put 활용해서 학원 -서울시강남구 등산-서울시 관악구
		//롯데타워 - 서울시 송파구 
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		System.out.println(map);
		
	
		System.out.println(map.get("롯데타워"));
		
		map.remove("등산");
		System.out.println(map);
		
		for(String a : map.keySet()) {
			
			System.out.println("value : " + a);
		}
		
	}
	public void practice3() {
		//특정 값이 존재하는지확인 
		//String Integer 과일 - 가격
		Map<String,Integer>map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		System.out.println("200원 과일이 존재하는가 : " + map.containsValue(200));
		
		//체리 과일이 존재하는지 
		
		System.out.println("체리가 존재하나요 : " + map.containsKey("체리"));
		
		//크기조회
		 System.out.println("현재 map의 크기 " + map.size());
	}
	public void practice4() {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		
		System.out.println(map.get(3));
		
		System.out.println(map.size());
		
		map.remove(4);
		
		System.out.println(map.isEmpty());
		
		for(int num : map.keySet()) {
			String 메뉴이름 = map.get(num);
			System.out.println(메뉴이름);
			
			
	
		
		}
		//Map.Entry 키-값을 동시에 가져오는방법 뒤에는 변수명entry.Set
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		map.clear();
	}
	
	
	
	
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		//mp.practice3();
		mp.practice4();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
