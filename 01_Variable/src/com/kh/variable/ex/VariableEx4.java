package com.kh.variable.ex;

public class VariableEx4 {

	public static void main(String[] args) {
	//상수 : 한번 값을 기록하면 값을 바꿀수없는 분수 
	//상수 키워드 : final
	//상수명 작성 : 대문자로 작성,연결되는 단어 사이는 _구분 
	//상수를 대문자로 표기하는것은 자바에서 개발자간의 규칙
		
	final double PI = 3.1415926538;
	System.out.println("상수로 표기한 PI : " +PI);
	
	//MIN=가장 최소값
	final int MIN = 0; 
	final int MAX = 100;
	
	//상수로 지정된 값을 변경하려하면 에러가 발생
	//상수 final을 사용해서  
	//string 으로 "Hello World" 넣어보기 
	//우리 회사에 들어오는 사람들한테는 
	//HelloWorld 문구로 보여주고 변경하고 싶지 않을때 
	final String GREETING = "HelloWorld";
	System.out.println(GREETING);
	
	}

}
