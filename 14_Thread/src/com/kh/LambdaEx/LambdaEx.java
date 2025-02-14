package com.kh.LambdaEx;
/*
 클래스식으로 구분해서 만드는 함수를 하나의 식으로 표현한것 
 메서드의 이름이 필요없기떄문에 이름이없어서 익명함수
 
 기존에 작성하던 방식
 public 반환타입 메서드명(매개변수){
    	실행문 
    }
 람다방식 ()-> "";
 
 람다식의 장점 :코드를 간단하게 만들수있음
 단점 : 람다식이 많아지면 코드사용의 구분이 어려움
 
 실행문 
 (매개변수목록) -> {실행될 코드블록}
 (    )->"";
 (    )->{   };
 
 
 
 
 
 
 */
public class LambdaEx {

private static int 숫자 = 0;
	
	public void 기본스레드() { //러너블연습.java +  러너블실행.java
		for(int i = 0; i < 3; i++) {
			Runnable r = new Runnable() {
				@Override
				public void run() {
					synchronized (LambdaEx.class) {
						숫자++;
						System.out.println("숫자 : " + 숫자);
					}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	}
	public void 람다() {
		for(int i =0; i<5; i++) {
			Thread t = new Thread(()->{
				synchronized(LambdaEx.class) {
					숫자++;
					System.out.println("숫자 : " + 숫자);
				}
			});
			t.start();
		}
	}
	
	
	
	
}
