package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Collection 인터페이스 파일들을 연결시켜주는 존재
 List , set 의 상위클래스
 순차적으로 회전하면서 코드를 조회하거나 코드안에 작성한 
 내용을 순회하고 추가 삭제 검색등 기본 작업 제공
 sort = 리스트를 기본 정렬 순서에 따라 정렬
 1. 숫자 : 오름차순 정렬 작은값에서 큰 값순서로 정렬
 2. 문자열 : 문자의 사전순서에따라 정렬 
 3. 우리가 파일을 만들면서 정한 기준 
 :comperTo()메소드를 활용해서 정렬 기준을 작성할수있음
 min,max = 최소값,최대값
 binarySearch : 이진탐색을 사용해서 리스트에서 지정된 요소찾기
 이진 탐색 : 정렬된 배열이나 리스트에서 특정한 값의 위치를 찾는 알고리즘
 	배열또는 리스트를 반으로 나눠서 탐색범위를 좁혀가며 값을 찾아냄

addAll : 지정된 모든값을 추가
 	
 
 */
public class CollectionEx {

	public static void main(String[] args) {
		//정렬 
		ArrayList<Integer> 숫자 = new ArrayList<>();
		숫자.add(3);
		숫자.add(5);
		숫자.add(4);
		숫자.add(1);
		System.out.println(숫자);
		//컬렉션을 이용해서 오름차순 정렬하기 
		Collections.sort(숫자);
		System.out.println(숫자);
		
		//ArrayList에서 add로 하나씩 추가하는게 아니라 
		//한번에 값을 추가하기 
					//()안에 Arrays.asList() 에 넣고싶은만큼 추가가능 
		ArrayList<String> 색상 = new ArrayList<>(Arrays.asList("black","white"));
		System.out.println(색상);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
