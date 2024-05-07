package kom.kh.operatorPre;

import java.util.Scanner;

public class operatorpre {

	
	
	
	
	//패키지 : 내가 만든 클래스가 들어있는 폴더 위치
	
	//클래스 : 내가 실행하고자 하는 코드를 작성하는 공간
				
	//기본 출력 메서드 
	//최종으로 출력 메서드가 아니지만 상황에 따라 
	//최종 메서드에서 호출해서 사용하는 메서드 중 하나 
	public static void practice1() {
					
		// 메인 메서드 : 최종으로 실행하는 메서드 
		//static : 메모리에서 고정 
		//모든 사람이 사탕을 골고루 나눠받기 
		//스캐너를 이용해서 키보드로 입력받은걸 출력 
		//system.in : 키보드로 입력받는 출력 시스템 
		//Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		Scanner sc = new Scanner(System.in);
		//스캐너를 불러온 다음에 바로 sc로 스캐너 기능을 불러와도 			//가능하지만 system.out.print를 이용해서 어떤 행동을 진행할지 
		//확인하는 작업을 진행할 것
		//인원수 입력 받기
		System.out.print("인원수를 입력하세요 ");
		int people = sc.nextInt();
		// 사탕 개수 입력받기 
		System.out.println("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		//한 사람당 나눠줄 사탕 개수 계산 
		int getcandies = candies/people;
		// 나눠주고 남은 사탕 계산 
		int remain = candies % people;
		//결과출력 
		System.out.println("참여인원 : " + people);
		System.out.println("캔디 총 갯수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + getcandies);
		System.out.println("남은 캔디 개수 : " + remain);
			
	}
	
	

	
	
	
	
	
	
	public static void main(String[] args) {

		}

	}
