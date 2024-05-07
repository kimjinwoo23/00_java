package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	
	public ArraysEx2() {
	
	}
	public void method1() {
		//숫자배열 생성
		int[] num = {6,4,2,3,5,7,9};
		
		//숫자 정렬하기 Arrays.sort
		Arrays.sort(num);
		//정렬된 내용 출력하기 Arrays.toString()
		System.out.println(Arrays.toString(num));
		//배열복사하기 num 배열을 abc에 복사하기
		int[] abc = Arrays.copyOf(num,num.length);
		//Arrays.copyOf(num,num.length)
		
		//num과 abc가 같은지 비교 Arrays.equals(num,abc)
		System.out.println(Arrays.equals(num, abc));
		
		//int[] 채우기 = new int[3]
		int[] 채우기 = new int[3];
		//Arrays.fill을 이용해서 6으로 모두 채우기
		Arrays.fill(채우기, 6);
		//채워진 채우기 변수를 출력 
		System.out.println(Arrays.toString(채우기));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

public static void main(String[] args) {
	ArraysEx2 ae = new ArraysEx2();
	ae.method1();
}


}