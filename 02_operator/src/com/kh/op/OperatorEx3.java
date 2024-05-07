package com.kh.op;

public class OperatorEx3 {

	public static void main(String[] args) {
	/*
	증감 연산자 :++ --
	++는 1을더한다는 의미 
	--는 1을뺀다는 의미
	
	전위 연산자 값을 하기 전에 더하거나 뺴는것 	
	후위 연산자 값을 계산후에 더하거나 빼는것  
    */
	int a = 10;
	int b = ++a;
	System.out.println(" a : "+  a + ", b :" + b);
		
	int c = 10;
	int d = c++;
	System.out.println(" c "+ c + ", d "+ d);
	
	
	
	}

}
