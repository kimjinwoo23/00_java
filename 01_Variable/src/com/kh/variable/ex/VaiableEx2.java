package com.kh.variable.ex;

public class VaiableEx2 {
	//메인 메서드 (프로그램 실행)
	public static void main(String[] args) {
	/*
	 * 컴퓨터에서 계산을 할 때 값 처리 원칙
	 * -같은 자료형끼리 연산, 결과도 같은 자료형
	 * 
	 * 만약에 다른 자료형끼리 연산하는 경우 자료형에 맞게 변환
	 * 
	 * 자동 형변환을 사용해서 처리 
	 * -연산시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환	
	 */
		
	//자동 형변환 확인1
	int num1 = 9;
	long num2 = 10_000_000_000L; // 100억
	//result=결과
	//int와 long을 더해서 총 100억9원
	long result= num1+ num2; 
	System.out.println("더한 결과 :"+ result+"원");
	
	//int result1 = num1 + num2;
	//cannot convert from long to int 발생 
	//long을 int에 대입할수 없음
	//강제로 형태를 변환해서 넣을수는 있지만
	//값이 꺠지거나 잘못된 값이 들어간다 
	//int + long 
	//->long + long 으로 자동 형변환 
	//결과도 long 
	//그런데 int형 변수에 long을 대입하려고 해서 오류 발생
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
