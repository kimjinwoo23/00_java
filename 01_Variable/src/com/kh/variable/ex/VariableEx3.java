package com.kh.variable.ex;

public class VariableEx3 {

	public static void main(String[] args) {
	/*
	강제 형변환
	1. 값의 범위가 큰 자료형을 ->작은 자료형으로 강제 변환 
	->데이터 손실을 고려해야함 
	2.의도적으로 자료형을 다른 자료형으로 변환 시킬 때 사용 
	사용 방법 
	(자료형) 변수명; 지정된 자료형으로 변경된다
	
	강제 형변환 확인 1 
	-> 자료형 변환 + 데이터 손실 */
	int num1 = 290;
	//int 4byte를 1byte으로 변경하겠다
	byte result1 = (byte) num1; //강제 형변환 하길 원함 
	System.out.println("num1 :" + num1 + " result1 : " + result1);
		
	}

}
