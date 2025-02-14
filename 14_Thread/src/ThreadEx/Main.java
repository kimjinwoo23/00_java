package ThreadEx;

public class Main {
	public static void main(String[] args) {
		ThreadEx 스레드 = new ThreadEx();
		스레드.start();
		
		System.out.println("1차 스레드 끝 Ex2스레드 시작");
		
		//for 총 3개의 스레드를 생성해서 실행 
		for(int i =0; i<3; i++) {
			Thread t = new ThreadEx2(i);
			
			
			if( i == 2) {			
				t.setPriority(Thread.MIN_PRIORITY);//1=제일 나중에 실행
			}else if(i == 1) {
				t.setPriority(Thread.MAX_PRIORITY);//10=제일 먼저 실행
			}else {//0
				t.setPriority(Thread.NORM_PRIORITY);//5
			}
				
			
			
			
			
			
			t.start();
		//ThreadEx2의 부모이기 떄문에 Thread왼쪽에 작성가능	
		}
		System.out.println("메인 끝");
	}
}
