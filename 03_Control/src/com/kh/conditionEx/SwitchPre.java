package com.kh.conditionEx;

import java.util.Scanner;

public class SwitchPre {

	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt();
		
		switch (day) {
		case 1 : 
			System.out.println("월요일 입니다 ");
		case 2 : 
			System.out.println("화요일 입니다 ");
			
		default :
			System.out.println("아무 요일도 아닙니다 ");
			
			
		}
		
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		int menunum = sc.nextInt();
		System.out.print("주문하실 번호를 눌러주세요 : ");
		switch(menunum) {
		case 1 : 
			System.out.println("아메리카노 나왔습니다 ");
		case 2 : 
			System.out.println("카폐라떼 나왔습니다 ");
			
		case 3 : 
			System.out.println("흑당 버블티 나왔습니다");
		defualt:
			System.out.println("잘못 입력했습니다 다시 눌러주세요 ");
			
		}
		
		
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도 이름을 입력해주세요 : ");
		String city = sc.nextLine();
		
		switch(city){
		case "서울" :
			System.out.println("대한민국 ");
		case "런던" :
			System.out.println("영국 ");
			break;
		case "도쿄" : 
			System.out.println("일본");
		defualt : 
			System.out.println("잘못된 이름입니다 ");
			
		}
		
		
		
		
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이번 달은 몇 월인가요? : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println("겨울");
		break;
		case 3:  case 4:  case 5 : 
			System.out.println("봄");
		case 6: case 7: case 8:
			System.out.println("여름");
		case 9: case 10: case 11 :
			System.out.println("가을");
		defualt:
			System.out.println("해당하는 계절이 없습니다 ");
			}
		
}
	
	public static void method5() {
	//등급에 따라서 학점을 출력하는 코드 
		Scanner sc = new Scanner(System.in);
		System.out.print("A,B,C,D,E,F,중 하나의 등급을 입력하세요 : ");
		//charAt을 호출해서 작성한 문자열중 0 번쨰를 호출한다
		char grade = sc.next().charAt(0);
		switch(grade) {
		case 'A':  case 'a':
			System.out.println("4.0");
			break;
		case 'B':  case 'b':
			System.out.println("3.0");
			break;
		case 'C':  case 'c':
			System.out.println("2.0");
			break;
		case 'D':  case 'd' :
			System.out.println("1.0");
			break;
		default :
			System.out.println("입력한 정보가 없습니다 ");
			
			
		}
		
		
		
		
	}
	
	public static void castingPractice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력해주세요");
		char inputchar = sc.next().charAt(0);
		//유니코드 출력
		int unicode = inputchar;
		System.out.println("입력한 문자 " + inputchar + "의 유니코드는 " + unicode + " 입니다 ");
		
		
		
		
		
	}
	
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록한것
		int inum1 = 10;
		int inum2 = 4;
		float fnum = 3.04f;///기본값이 double이기 떄문에 float으로 변경
		double dnum = 2.5;
		char ch = 'A';
		System.out.println(inum1 / inum2);//2 : 몫이 2라면 뭘 넣어야할지
		System.out.println((int)dnum);//2 // double에 실수로 되어있는걸 정수로 변경
		System.out.println((double)inum2 * dnum);//10.0
		//작은값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 떄문에 (double)이 필수는아니다
		System.out.println((double)inum1);//10.0
		System.out.println((double)inum1 / (double)inum2);//2.5		//정수에서 실수형으로 변경
		System.out.println(dnum); // 2.5
		System.out.println((int)fnum);//3 //실수형을 정수형으로 변경
		System.out.println();// 3
		System.out.println(inum1 / fnum);//3 //나누기를해서 몫이 3
		//int와 float은 같은 크기의 byte 정수인지 실수인지 표기
		//float 소수점 이하 6자리 까지만 기본으로 보여준다 
		System.out.println((double)inum1 / fnum);//3.333333
		System.out.println((double)inum1 / fnum); // 3.33333333333335
		System.out.println(ch);//'A';
		System.out.println((int)ch);//65
		System.out.println(ch+inum1);//75
		//A값이 (int)ch를 통해 65
		//65+ inum1 = 75
		System.out.println((char)(ch+inum1));//'K'
		
		
	}
	
	public static void controlPractice1() {
	}
	public static void controlpractice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요 ");
		/*system.out.print 에서 출력할 내용이 길어지면
		줄 바꿔서 글을 작성할떄 \n을 이용해서 줄을 바꾸고 출력한다 
		 \n :세로로 줄바 꿈 
		 \r : 키보드 입력하는 위치를 현재 줄의 맨 처음으로 이동
		 system.out.print();
		 +는 ); 붙이지 않는한 계속 이어서 작성할수 있다 
		 */
		System.out.println("1. 메뉴 출력\r\n"
			+ "2.짝수/홀수\r\n"
			+ "3.합격/불합격\r\n"
			+ "4.계절\r\n"
			+ "5.로그인\r\n"
			+ "6.권한 확인\r\n"
			+ "7.BMI\r\n"
			+ "8.계산기\r\n"
			+ "9.P/F ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("메뉴 출력 ");
			break;
		case 2 : 
			System.out.println("짝수/홀수 ");
			break;
		case 3 : 
			System.out.println("합격/불합격 ");
			break;
		case 4 : 
			System.out.println("계절 ");
			break;
		case 5 : 
			System.out.println("로그인 ");
			break;
		case 6 : 
			System.out.println("권한 확 ");
			break;
		case 7 : 
			System.out.println("BMI ");
			break;
		case 8 : 
			System.out.println("계산기 ");
			break;
		case 9 : 
			System.out.println("P/F ");
			break;
			default : 
				System.out.println("잘못된 입력입니다");
					
		}
	}
		
	public static void controlPractice5() {
		Scanner sc = new Scanner(System.in);
		String id1 = "myid";
		String pswd1 = "mypswd";
		System.out.println("아이디 : ");
		String inputid = sc.next();
		System.out.println("패스워드 : ");
		String inputpswd = sc.next();
		
		if(inputid.equals(id1)&&inputpswd.equals(pswd1)) {
			System.out.println("로그인 되었습니다");
			
			//! 특정조건을 부정하는데 사용 
			//inputid.equals(id1) : 두 id가 일치하는지확인
			// inputid.equals(id1) 앞에 !가 붙으면
			//일치하지않을때 참이돼어서 정립가능
			
		}else if (!inputid.equals(id1)){
			System.out.println("아이디가 틀렸습니다");
			
			
		}else if (!inputpswd.equals(pswd1)) {
			System.out.println("비밀번호가 틀렸습니다");
		}else {
			System.out.println("잘못 입력된 값입니다");
		}
		
		
}
	
	public static void controlPractice6() {
		//회원 등급 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인할 회원 등급");
		//권한이나 규칙설정에 자주쓰는 변수명은 : Role
		String user = sc.next();
		System.out.println("해당 회원 등급의 권한");
		switch (user) {
		case "관리자" : 
			System.out.println("회원관리,\n"
					+ "게시글관리,\n"
					+ "게시글작성,\n"
					+ "게시글 조회,\n"
					+ "댓글작성");
			break;
		case "회원" : 
			 System.out.println("게시글작성\n"
			 		+ "게시글 조회\n"
			 		+ "댓글작성\n");
			 break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("잘못된 회원 등급입니다");
		}
		
		
		
	}
	
	
	public static void controlPratice8() {
		/*
		 키보드로 두개의 정수와 연산기호를 입력받아 
		 연산기호에맞춰 연산결과 출력 
		 두개의 정수 모두 양수일때만 작동하며 
		 없는 연산기호입력시 잘못입력했습니다 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1번을 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수2번을 입력하세요");
		int b = sc.nextInt();
		System.out.println("연산기호를 입력하세요 + , - , * , / , %");
		String c = sc.next();
		
		double result;
		switch(c) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
			// / % 는 0으로 나눌수없기떄문에 if문으로
			//값이 0이될 경우 처리를 해줘야함 
		case "/":
			if(b == 0) {
				System.out.println("0으로 나눌수없습니다. \n"
						+ "프로그램을 종료합니다");
				 return;
			}
			result = (double)a/b;
			break;
		case "%":
			if(b==0) {
				System.out.println("0으로 나눌수없습니다\n "
						+ "프로그램을 종료합니다");
				return;
			}
			result = a%b;
			break;
		default:
			System.out.println("잘못된 입력입니다");
			return;
			
		}
		System.out.println(a + " " + c + " " + b + " = " +result);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
		//castingPractice1();
		//castingPractice3();
		//controlpractice10();
		//controlPractice5();
		controlPratice8();
		/*
		 표기법 
		 스네이크 케이스 변수명에 언더바가 들어있는 표현방식
		 	snake_case
		 파스칼 케이스 
		 	첫 글자와 중간 글자들이 대문자로 사용하는 표현방식 
		 	Pscalcase
		 카멜 케이스 
		 	중간글자만 대문자로 시작하는 표현방식
		 */
		
	}

}
