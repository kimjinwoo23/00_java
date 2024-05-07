package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 Comparator:비교하는 객체 
 메서드 
 compare(변수명1 , 변수명 2): 두객체나 변수를 비교해서 정렬순서 결정
  변수명 1이 변수명2보다 작으면 음수반환
  변수명1=변수명2 같으면 0을반환 
  변수명1이 2보다크면 양수를반환
reversed():순서를 거꾸로 뒤집어서 순서를 매길 떄 사용
reversed:영어로 반전.
comparing(클래스명::참조할 메서드명) 클래스밑에서 참조할 메서드를 가지고와서 정렬기준설정
 
 */
public class ComparatorEx {

	public static void main(String[] args) {
		List<String> 단어 = new ArrayList <>(Arrays.asList("사과","바나나","체리"));
		//단어에서 단어의 길이를 기준으로 정렬하자		//클래스명 ::참조할메서드명
		Comparator<String> 길이비교 = Comparator.comparing(String::length);
		
		//sort사용해서 정렬 
		단어.sort(길이비교);
		//정렬된 리스트 출력
		System.out.println("문자열 길이를 기준으로 정렬된 리스트 : " + 단어);
	}
	
}
