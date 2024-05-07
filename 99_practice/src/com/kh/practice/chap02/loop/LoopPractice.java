package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void Geeting() {
		System.out.println("안녕하세요");	
	}
	public void Geeting2() {
		System.out.println("반갑습니다");
	}
	
	
	public void practice2(){
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 
	//숫자들을 모두 출력하세요 단 입력한 수는 1보다 크거나 같아야 합니다.
	//만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요 ");
			return;
		}
		//1부터 ~ 까지의 숫자들이 나왔는지 출력을 보고싶다면 
		for(int i = 1; 1<= num; i++) {
			System.out.println(i + " ");
			//
			System.out.println(i + "<=" + num);
		}
			
		System.out.println("1부터" + num + "까지의 숫자들 ");
	
	
			
	
		
		System.out.println();
}



	public void practice3(){
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 
	//모든 숫자를 거꾸로 출력하세요 단 입력한 수는 1보다 크거나 같아야 합니다
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 숫자를 다시 입력해주세요");
			}else {
				break;
			}
					
		}
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다 ");
		while(num >= 1) {
			System.out.println(num + " ");
			num --; //키보드로 입력받은 숫자에서 -1을 하면서 1이될떄까지 출력 
		}
		System.out.println();
		
		
		
		
		
	}

	public void practice12(){

		Scanner sc = new Scanner(System.in);
		//두 정수와 연산기호를 받아서 계산하는 메소드
		//연산의 경우에는 + / - * %
		String operator; 
		
		while(true) {
			System.out.println("프로그램 종료를 원할경우 exit를 입력하세요");
			System.out.println("연산기호 입력 (+ - * / %) : ");
			
			operator = sc.next();
			
			//만약에 exit를 입력해서 프로그램 종료를 원할경우 
			//문자열 String 으로 비교할떄 equals ==
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}	
			//정수 1과 정수 2를  입력받아서 계산하기
			System.out.println("정수1 : ");
			int 정수1 = sc.nextInt();
			System.out.println("정수2 : ");
			int 정수2 = sc.nextInt();
			//정수 1과 정수 2 계산에 대한 결과 
			int 결과;
			
			if(operator.equals("+")) {
				결과 = 정수1 + 정수2;
			}else if(operator.equals("-")) {
				결과 = 정수1-정수2;
			}else if(operator.equals("*")) {
				결과 = 정수1*정수2;
			}else if(operator.equals("/")) {
				//몫은 0으로 나눌수없어서 정수2는 0이될수없음
				if(정수2 == 0 ) {
					System.out.println("0으로 나눌수 없습니다");
				}
				결과 = 정수1 / 정수2;
			}else if(operator.equals("%")) {
				//%의 경우에도 0으로 나눌수없기떄문에 2는 0이될수없는걸 기입
				if(정수2 == 0) {
					System.out.println("0으로 나눌수없습니다");
				}
				결과 = 정수1%정수2;
				
			}else {
				System.out.println("잘못입력했습니다");
				continue;
			}
				
			System.out.println(정수1 + " " + operator + " " + 정수2 + " = " +  결과 );
			
		}	
	}
	

	public void practice4() {
		//1미만의 숫자가 입력되면 1 이상의 숫자를 입력해주세요 출력
		//사용자가 값을 입력하도록 하기
		//숫자를 입력받은 숫자부터 1 까지 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num;
		//do-while 조건이 참이 아니여도 최초1회실행
		do {
			System.out.println("숫자를 입력해주세여 : ");
			num = sc.nextInt();
			//1미만의 숫자가 들어오면 !
			if(num<1) {
				System.out.println("1이상의 숫자를 입력하세요");
			//조건에 관계없이 do로 1회실행되는 것이기떄문에
			//break나 return은 작성하지않음
				
	}
	}
		while(num > 1);
		//만약에 1보다 커서 밑으로 내려온다면 
		//num부터 1까지 거꾸로 출력하기
		for(int i = num; i >= 1; i--)
			System.out.println(i + " ");
		
		
	}
		
	public void practice5() {
	//1부터 입력받은 수까지의 정수들의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("수 하나를 입력하세요 ");
		int num = sc.nextInt();
		//입력받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		//숫자가 들어왔을 때 1부터 입력받은 수까지 더해서 
		//총합구하기 
		for(int i = 1; i <= num; i++) {
			result += i;
			//더해지는 숫자 출력하기
			if(i < num ) {
				System.out.println(i + " ");
			}else { // i > num
				System.out.println(i + " = ");
			}
		}
		System.out.print(result );
		
		
	}
	
	public void practice7() {
		/*
		 사용자로부터 값두개를 입력받아 
		 그사이의 숫자 출력하기 1 미만일경우 1이상의 숫자요구 출력
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("첫번쨰 숫자를 입력하세요");
			int first = sc.nextInt();
			
			System.out.println(("두번쨰 숫자를 입력하세요"));
			int second = sc.nextInt();
			//첫번쨰와 두번쨰 숫자가 1보다 크거나 같을경우
			if(first >= 1 && second >= 1) {
				for(int i = first; i <= second; i++){
				System.out.println(i + " ");
				break;
				
}
}
}
	
		
		
		
		
	}
	
	//13과 14는 이중 for 문문제
	public void practice13() {
		//키보드로 입력받고 별찍기
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		for(int 세로줄 = 1; 세로줄 <=num; 세로줄++) {
			for(int 별 = 1; 별 <= 세로줄; 별++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}


	public void practice14() {

		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		 // 이중 for 문  조건식;  증감식;
		 	for (int line = 0; line >= 1; line++)
		 	for(int star = num; line >=star; star--) {
		 		System.out.print(" * ");
		 	}
		 	System.out.println();
}
	
	
	/*
	 ****
	  ***
	   **
	    *
	 */
	
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 ");
		int size = sc.nextInt();
		for(int line = 0; line < size; line++ ) {
			
			//blank는 공백을 출력하기위한 for 문 
			//line 번쨰 줄에서 line개의 공백을 출력한다
			for(int blank = 0; blank < line; blank++) {
				System.out.print("  ");
			}
			//star 은 별을 출력하는 for 문 
			//line 번쨰 줄에서는 size - line 개의 별을 출력 
			
			for(int star = size; star > line; star --) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
		
}
