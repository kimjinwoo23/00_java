package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	
	//LoopForEx에서 출력하길원한다면
	//메인메서드를 추가하고 아래 구구단에 static 삽입
	//static을 안붙이고출력한다면
	//출력용클래스 만들기 LoopForRun
	//종료를 하기 전까지 반복해서 출력
	public void guguDan(){
		//사용자로부터 수를 입력받고 수에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.println("1~9 중 하나를 입력해주세요");
			//반복하기위해 while문 사용
		
			int dan = sc.nextInt();
			
			//만약에 숫자 0이 들어오면 프로그램 종료하기
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			for(int i = 1; i <=9; i++) {
				System.out.println(dan + "단 * " + i + " = " + (dan*i));
			
		}
		}
		
	}

	public void gugudan2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("종료를 원할경우 0 입력하기");
		System.out.println("수를 입력하세요");
		
		int dan = sc.nextInt();
		
		if(dan == 0) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		//continue는 자주 사용하지않음
		//if 1~9까지만 입력 가능하도록 조건
		if(dan < 1 || dan >9) {
			System.out.println("1부터 9까지의 숫자를 입력하세요");
			continue;
		}
		for(int a = 9; a>=1; a--) {
		System.out.println(dan+ " * " + a + " = " + (dan*a));
			
		}
		}	
	}
	
	public void gugudan3() {
	//구구단을 1단부터 9단까지 모두 출력
	//int dan == 원하는 단만 지정출력
		//1단부터 9단까지 출력
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("****** " + dan + " ******* ");
		//1단에서 부터 1~9를 곱해준 값을 출력
		for(int num = 1; num<=9; num++) {
		
			System.out.println(dan + " * " + num + " = " + (dan*num));
		
		}	
		}	
	}	
	//구구단을 2단부터 9단까지 
	public void gugudan4() {
		//수의 시작점 			범위		증감정도
		for(int dan = 2; dan <=9; dan++) {
			System.out.println("****" + dan + "****");
		for(int num1 = 2; num1 <=9; num1++) {
			System.out.println(dan + " * " + num1 + " = " + (dan*num1));
		}
		}
	}
	
	//10개의 숫자 랜덤 출력
	public void randomNumber() {
		//random을 불러와서 내가 지정한 범위에 무작위 숫자를 출력시키는것
		Random 랜덤 = new Random();
		//nextInt()안에 숫자를 넣어서 어디서부터 어디서까지 랜덤으로 숫자가 나오는지
		//범위지정 가능 
		int 랜덤숫자 = 랜덤.nextInt(9);
		//숫자를 셀떄 코드에서는 0부터 시작 랜덤으로 지정한 숫자 -1
		System.out.println("랜덤숫자 : " + 랜덤숫자);	
		
	}
		
		//랜덤으로 숫자 세개 출력하기 
		public void Randomss() {
			Random ran = new Random();
			//랜덤숫자 1~10중에 3개 
			for (int num = 1; num<=3; num++) {
				//랜덤으로 숫자 만들기
				int num2 = ran.nextInt(10)+1;
				System.out.println("랜덤 숫자 : " + num + " : " + num2 );
				
			}
		}
		
		public void dice() {
			//랜덤으로 1 ~ 45 번호 6자리를 for 출력 
			Random dice1 = new Random();
			for(int num1 =1; num1 <= 6; num1++) {
				int randomDice = dice1.nextInt(45)+1;
				//if 랜덤숫자가 같다면 번호를 제외하고 출력 
				System.out.println("랜덤숫자 " + num1 + " : " + randomDice);
			}
				
		}
		
		// 1부터 10까지의 숫자중에서 홀수만 출력하기
		//홀수:odd 
		public void odd() {
			for(int num = 1; num <= 10; num++) {
				if(num % 2 != 0 ) {
					System.out.println("num");
}
}
}
		
				//짝수만 1~ 10 출력하기 
		public void even() {
			for(int num = 1; num <= 10; num++) {
				if(num % 2 == 0) {
					System.out.println("num : "+ num);
}
}
}
	//정사각형 모양의 별 출력 
	public void squarestar() {
		int star = 3;
		for(int i = 0;  i < star; i++) {
			
			for(int j = 0; j < star; j++) {
				System.out.println("* ");
}
			System.out.println();//가로로 별 출력한다음 줄바꿈
			
}
}
	
	
	//정사각형 모양으로 별 가로로 5개씩 출력 
	public void fivestar() {
		int star = 5;
		for(int i = 0;  i < star; i++) {
			
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
}
			System.out.println();
}
}
	
	public void numberGame() {
		//숫자맞추기 게임 만들기
		Scanner sc = new Scanner(System.in);
		//랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
		 
		//랜덤으로 숫자만들기
		
		Random random = new Random();
		while(true) {
		int randomNumber = random.nextInt(3)+1;//1~3
		System.out.println("숫자를 맞춰보세요 : ");
		for(int atk = 1; atk <= 2 ; atk++) {
		System.out.println("공격을 "+ atk + "회 시도합니다  ");
		int guest = sc.nextInt(); //게스트가 입력한 숫자 가져오기
		//숫자를 맞출떄까지 문제를 반복하기
		
		if(guest == randomNumber) {
			System.out.println("정답입니다 ");
			break;
		}else if(guest < randomNumber) {
			System.out.println(" 오답입니다 수가 너무 작습니다 ");
		}else if(guest > randomNumber) {
			System.out.println(" 오답입니다 수가 너무 큽니다 ");
		}else {
			System.out.println("틀렸습니다");
			System.out.println("정답은 : " + randomNumber);
}
}
		System.out.println("게임을 다시 시작하시겠습니까 (1번 yes/ 2번 no)");
		int playAgain = sc.nextInt();
		if (playAgain== 2) {
			System.out.println("게임을 종료합니다");
			break;
		}
}
}
	
	public void practice5() {
	//1부터 사용자에게 입력받은 수까지의 정수의 합 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력해주세요");
		int num = sc.nextInt();
		//int a = 1;
		for(int a=1; a < num; a++) {
			a += 1;
			System.out.print( a    );
				
		}
		
		
	}
	
	
	
	
}
	

