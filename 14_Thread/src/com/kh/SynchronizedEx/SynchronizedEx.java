package com.kh.SynchronizedEx;
/*
 Synchronized
 멀티스레드 환경에서 공유하는 데이터에 동기화를제공
 여러스레드가 하나에 동시에 접근할 때 발생할수있는 문제를 해결
 특정 코드 영역을 잠금처리해서 한번에 하나의 스레드만 접근가능
 
 
 
 
 */
public class SynchronizedEx {

	private static int 숫자 = 0;
	public static void main(String[] args) {
		
		for(int i = 0; i< 5; i++) {
			
			Thread t = new Thread(()-> {
				//잠견진 블록에 접근해서 카운터를 증가시킴
				synchronized (SynchronizedEx.class) {
					숫자++;
					System.out.println("숫자들 : " + 숫자);
				}
				
			});
			t.start();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
