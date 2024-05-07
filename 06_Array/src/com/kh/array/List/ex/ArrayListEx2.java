package com.kh.array.List.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

	
		
		//기본생성자
		public ArrayListEx2 (){
		
			
			
	}
		public void method1() {
			//딸기 바나나 사과
			ArrayList<String>list = new ArrayList<>();
			
			//add를 사용해서 딸기 바나나 사과추가 
			list.add("사과");
			list.add("딸기");
			list.add("바나나");
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			list.set(2, "키위");
			
			System.out.println(list.size());;
			
			list.remove(2);
			
			System.out.println(list.isEmpty());
			//앞으로 사용할 for문 
				
			for(String 과일  : list) {
				System.out.println(과일);
			}
			
			
			
			
			
		}
		
		public static void method2() {
			ArrayList<String>animal = new ArrayList();
			//동물 사자 호랑이 고양이 강아지
			animal.add("사자");
			animal.add("호랑이");
			animal.add("고양이");
			animal.add("강아지");
			//size() 동물이 얼마나 있는지 
			System.out.println("size : " +animal.size());
			//get으로 확인 
			System.out.println("1 : " + animal.get(0));
			System.out.println("2 : " + animal.get(1));
			System.out.println("3 : " + animal.get(2));
			System.out.println("4 : " + animal.get(3));
			//고양이를 토끼로 변경 
			animal.set(2, "토끼");
			//remove 강아지 삭제 
			animal.remove("강아지");
			//for 문 사용해서 get출력 
			for(String 동물 : animal) {
				System.out.println("동물 : " + 동물);
			}
			//clear 사용해서 다 삭제하기 
			animal.clear();
			//isEmpty() 삭제했는지 확인 
			System.out.println(animal.isEmpty());
		}
		
		public static void method3() {
			
			ArrayList<String>pizza = new ArrayList<>();
			// 고구마피자 포테이토 피자 페퍼로니 피자
			System.out.println("~~~~ 피자 메뉴 ~~~~");
			
			pizza.add("고구마피자");
			pizza.add("포테이토피자");
			pizza.add("페퍼로니피자");
			System.out.println( pizza.size());
			
			//모두보기
			System.out.println("모든메뉴 보기 "+ pizza);
			
			System.out.println("메뉴! :" + pizza.get(0));
			System.out.println("메뉴! :" + pizza.get(1));
			System.out.println("메뉴! :" + pizza.get(2));
			
			pizza.set(2, "파인애플피자");
			System.out.println("메뉴변경 :" + pizza.get(2));
			pizza.remove(2);
			
			for(String 피자가게 : pizza) {
				System.out.println("메뉴! :" + 피자가게);
			}
				System.out.println("피자가게가 사라질 예정입니다");
				pizza.clear();
				System.out.println(pizza.isEmpty());
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

public static void main(String[] args) {
	
	
	method3();
	
	
	
	
	
	
	
	
	
	
}
}