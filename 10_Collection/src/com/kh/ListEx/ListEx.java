package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*
 List:자료를 순차적으로 나열한 자료 구조(배열과비슷)
 인덱스가 존재함
 인덱스로 순서가 구분되기떄문에 중복데이터 저장이 가능
 인터페이스이기 떄문에 객체로는 생성이불가능 다형성으로 이용할수있음
 사용예제
 List list = new ArrayList(3); :3칸짜리생성
 E(Element) :요소를 뜻하는 상징적인글자(자료형x)
 					==Object String Student 등
 					객체를 가리지않고 넣을수있음 
 					
 */


public class ListEx {

	public static void main(String[] args) {
		/*
		 List list = new ArrayList(3);에서 List한 다음
		 List list<자료형> = new ArrayList(3);<>안에 타입을지정하지않아
		 노랗게 경고가 발생
		 만약에 노란색을 없애고싶다면 List<자료형>을넣어서 사용가능 
		 Object = String Integer Boolean등등 모두 사용가능 
		 
		 
		 
		 */
		//List 객체 생성후 ArrayList인스턴스 생성
		List list = new ArrayList(3);
		list.add("아무거나");//add로 추가할수있음
		list.add(new Object());
		list.add(123123);
		list.add(false);//3을 초과해서 추가해도 크기가 자동으로 늘어나 에러가발생안함
		System.out.println(list);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
