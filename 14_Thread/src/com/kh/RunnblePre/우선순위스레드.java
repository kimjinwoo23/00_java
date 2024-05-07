package com.kh.RunnblePre;

import com.kh.ThreadEx.스레드연습;

public class 우선순위스레드 {

	public static void main(String[] args) {
		//for문으로 1부터 3까지반복
		//1부터 3까지 차례대로 실행 설정하기 
		
		for(int i = 1; i <=3; i++) {
			스레드연습 n  = new 스레드연습(i);
			if(i ==1 ) {
				n.setPriority(Thread.MAX_PRIORITY);
			}else if( i == 2) {
				n.setPriority(Thread.NORM_PRIORITY);
			}else {
				n.setPriority(Thread.NORM_PRIORITY);
			}
			n.start();
		}
		System.out.println("종료");
		
	}
	
	
	
	
	
	
}
