package ThreadEx;

//Thread 클래스 가져오는 작업
public class ThreadEx2 extends Thread{

	//필드 
	int 초;
	
	//메서드 
	//생성자: 필수 
	public ThreadEx2(int 초 ) {
		this.초 = 초;
		
	}
	//void run 
	public void run() {
		System.out.println(this.초 + "스레드 시작");
		
		try {
			//1초대기이긴 하지만 대기중에 문제가발생할수있기 
			//떄문에 1초대기에 예외를걸어줌
			Thread.sleep(1000);
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료중");
	}
	
	
}
