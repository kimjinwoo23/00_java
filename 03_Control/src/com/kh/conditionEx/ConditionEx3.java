package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if 문으로 정수,실수, 문자열,문자 등 모든걸 비교할수있음
	 대표적으로 정수 비교와 문자열 비교가 있음
	 
	 정수비교
	  	if (숫자==숫자){
	  	숫자와 숫자가 같을떄 실행할 출력문 
	  	}
	  	문자열 비교
	  	     a              b
	  	if("문자열".equals("문자열"){
	  	문자열과 문자열이 같을떄 실행할 출력문 
	  	}
	  	문자열을 String 으로 변수명에 넣어준다면 
	  	"문자열" 큰따옴표를 붙여서 적지않고 지정해준
	  	변수명을 적어주면 됀다.
	  	
	  	String str = "문자열";
	  	
	  	if(str.equals(str)){
	  	System.out.print("문자열이 동일합니다");
	  	}
	  	if ("문자열".equals(str){
	  	sysout("문자열이 동일합니다")
	  	}
	  	a와 b에 자리엔 문자열 또는 변수명이나
	  	다른게 들어가도 비교가 가능하다
	  	
	 */
	
	
	public static void main(String[] args) {
		//정수비교
		int number = 10;
		if (number == 10) {
			System.out.println("숫자가 동일합니다 ");
		}
		//문자열비교
		String str ="hello";
		//만약에 두 문자열이 같다면 
		if(str.equals("hello")    ) {
			System.out.println("두 문자열이 같습니다. ");
			
	}
		String str1 = "둘";
		String str2 = "";
		
		if ("둘".equals(str1)) {
			System.out.println("모두 둘 입니다. ");
		
			
		}
	}
}
