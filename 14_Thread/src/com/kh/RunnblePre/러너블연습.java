package com.kh.RunnblePre;

public class 러너블연습 implements Runnable {
 
	//필드 
		int 초;
		
	//메서드
		//필수생성자
		public 러너블연습(int 초) {
			this.초 = 초;
		}
		//void run() sleep 1000 초 try catch this.초 + "  스레드 시작"  
		public void run() {
			System.out.println(this.초 + " 스레드 시작");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.초 + "스레드 종료");
		}
		
		//this.초 + 스레드 종료
	}