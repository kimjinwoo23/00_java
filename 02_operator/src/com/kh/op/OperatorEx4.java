package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
	/*비교 연산자
	데이터가 같은지 다른지를 비교할 떄 사용
	결과는 항상 true false로 나타남 
	
	사용 방법 
	a==b a 와 b 가 같으면 true
	a==b a 와 b 가 다르면 false
	
	a!=b a 와 b 가 다르면 true 
	a!=b a 와 b 가 같으면 false 
	
	!= 부정할떄 사용하는 연산자
	== 같을떄 사용하는 연산자 	
	*/	
		
	int a = 10;
	int b = 10;
	//System.out.println으로 무언가를 출력할 떄 
	//+ 는 " " 문자열이 있으면 각 각의 값을 이어주는 역활
	//문자열이 들어간 출력 프린트에서 
	//연산(+ - * / true false)
	//같은 작업을 진행하기 위해서는 우선순위 1번인 () 를 이용해서
	//연산작업을 먼저 진행하고 연산이 끝난 결과를 문자와 이어 붙인다
	System.out.println("a == b 일 떄: " + (a==b));
	
	System.out.println(a == b );
	//a = 10 b =10 
	int c = 20;
	int d = 10;
	
	System.out.println(c != d );
	
	//1. a가 10이고 c가 20인데 ==를 쓸 경우 
	System.out.println("↓↓a == c ↓↓"); 
	System.out.println(a == c);
	// a==c 는 값이 다르기때문에 false 
	
		
		
	}

}
