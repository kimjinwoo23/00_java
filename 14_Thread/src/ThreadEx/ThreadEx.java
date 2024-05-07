package ThreadEx;
/*
 process: program + success =프로그램 실행 성공 =실행중
 Thread(스레드):실
 스레드는 컴퓨터에서 실제로 작업을 수행하는것을 의미 
 두개이상의 스레드를 가지는 프로세스를 멀티스레드라한다
 
 스레드를 생성하는 방법
 1.Runnable 인터페이스 사용 클래스명 옆에 implements Runnable
 2. Thread클래스 상속받기 클래스명 옆에 extends Thread
 메서드와 관계없이 스레드를 시작할떄는 start() 사용해야함
 스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작되는 지점에따라 달라짐 
 
 스레드는 기본으로 우선순위가 5
 우선순위는 1~10까지 있음 
 Thread.MIN_PRIORITY=가장 작은우선순위(1)
 Thread.NORM_PRIORITY=우선순위5(기본)
 Thread.MAX_PRIORITY=우선순위(10)
 
 스레드에서 말하는 우선순위는 CPU자원을 더 많이 확보하는 우선순위
 우선순위가 높은 스레드가 항상 먼저 실행하는것은 아님 
 
 sleep: ? 초간 일시 정지 후 다시 시작
 
 suspend : 일시중지
 
 resume : 일시중지한 스레드 다시시작 
 
wait() :특정조건이 충족할떄 까지 대기 
notify() : 대기중인 스레드를 깨워 특정작업을 진행 
await() : condition 속한 스레드를 일시적으로 대기 
signal() : await에 의해 대기하고있는 스레드를 깨움

만약에 우선순위에서 1 5 10 이외의 우선순위를 사용하고싶다면 
priority()괄호안에 숫자를 넣어주자
 
 
 */
public class ThreadEx extends Thread{

	
	
	public void run() {
		System.out.println("스레드 실행중");
		
		try {
			Thread.sleep(1000);
			
			System.out.println("1초 끝");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//1초동안 정지
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
