package com.kh.inheritance.ex;

import com.kh.inheritance.스마트폰;

public class 핸드폰확인 {

	
	
	public static void main(String[] args) {
		
		
		스마트폰 p1 = new 아이폰();
		//아이폰 p1 = new 아이폰();
		//하나의 클래스에 하나의 상속만 가능
		
		p1.set화면("레티나 디스플레이");
		System.out.println("p1.화면" + p1.get화면());
		
		p1.set통신사("KH");
		System.out.println("p1통신사는" + p1.get통신사());
		
		p1.set성능("최신");
		System.out.println("p1성능은"+p1.get성능());
		
		아이폰 p2 = new 아이폰();
		p2.set화면("사과");
		p2.set통신사("KH");
		p2.set성능("초고속");
		System.out.println(p2.toString());
		
		
		스마트폰 g1 = new 갤럭시();
		g1.set화면("아몰레드");
		g1.set통신사("KH");
		g1.set성능("최신초고속");
		
		//g1 안드로이드를 가져오고 싶다면 
		//다운캐스팅 : 강제형변환을 한후에 가능
		갤럭시 g2 = (갤럭시)g1;
		g2.set안드로이드(4);
		//g1을 g2에 담아서 사용할수있게만듬
		
		System.out.println(g2.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
}
