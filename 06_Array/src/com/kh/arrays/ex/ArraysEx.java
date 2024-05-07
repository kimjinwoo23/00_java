package com.kh.arrays.ex;

import java.util.Arrays;

/*
 	Arrays
 	배열과 관련된 다양한 작업을 쉅게처리하도록 도와줌
 	정렬,복사,비교
 메서드
 	sort(): 배열을정렬
 	copyOf() :배열을 복사해서 똑같은배열을 생성
 	equals() : 두 배열이 똑같은지 비교 
 	fill() : 배열을 모두 지정된 값으로 채우기
 	toString() : 배열을 문자열로 변경해서 보여줌
 	asList() : 배열을 리스트로 변환해서 추가 배열을 수정하지않고 
 	배열의 내용을 감싸서 보여줌 
 	String[] 배열 = {"사과","바나나"};
 	List계열에 추가할떄 
 	ArrayList<String> 리스트 =Arrays.List(배열);
 	ArrayList<String> 리스트 =Arrays.List("사과","바나나");
 	
 	 
 	*/
public class ArraysEx {
	
public static void main(String[] args) {
		
	
	//숫자 배열을 생성
		
	int[]num = {5,8,2,4,3};
	//정렬하기 
	Arrays.sort(num);
	//배열을 오름차순으로 정렬해서 문자열로 출력
	System.out.println(Arrays.toString(num));
	
	//배열을 복사 
	//배열이 들어갈 변수명 먼저 생성
	//int 배열일경우 int 배열을 생성
					//복사 붙여넣기 복사될변수:num 어디까지 복사를 할것인가
	int[] abc = Arrays.copyOf(num, num.length);
	//num 변수가 abc로 잘 복사됐는지 확인 
	System.out.println("num이 복사된 abc : " + Arrays.toString(abc));
	
	//두 배열이 똑같이 생겼는지 확인 
	boolean same = Arrays.equals(num, abc);
	System.out.println("똑같은가요 : " + same);
	
	//모든 0~4까지 모두 똑같은 값으로 지정해서 출력하고싶다면
	int[]  똑같은숫자들 = new int[5];
	Arrays.fill(똑같은숫자들, 3);
	System.out.println("숫자 3으로 모두 채우기 : " + Arrays.toString(똑같은숫자들));
	
	
	
	
	
	}
	
	
}
