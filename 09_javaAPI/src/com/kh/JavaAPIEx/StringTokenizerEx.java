package com.kh.JavaAPIEx;

import java.util.StringTokenizer;

/*
 StringTokenizer 
 Token = 동전 , 최소단위 , 정보를가진 물리적 가상적 물체 
 
  
  
  
 */
public class StringTokenizerEx {

	public static void main(String[] args) {
										//소괄호안에 큰따옴표랑 무언갈 넣어야함
		StringTokenizer 토큰 = new StringTokenizer("졸려");
		while(토큰.hasMoreElements()) {
			System.out.println(토큰.nextToken());
		}
												//,로 구분하지않는다면 
		                                        //띄어쓰기를 줄바꿈으로 적용됌
		StringTokenizer 토큰2번 =new StringTokenizer("오렌지,사과,포도");
		while(토큰2번.hasMoreTokens()) {
			System.out.println(토큰2번.nextToken());
		}
		
		
	}
	
	
}
