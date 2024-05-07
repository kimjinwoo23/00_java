package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
	/* Scanner class
	 * 사용자로부터 키보드 입력을 받기위해 
	 * Java에서 제공하는 클래스
	 * 기본으로 구성되어있는 것은 아님 
	 * import java.util 패키지 표기를 해준 후 사용할 수 있음
	 * import 정확한 표기 법: import java.util Scanner;
	 * import 는 가져온다는 의미
	 * 
	 * Scanner.next() :공백없이 단어 1개 입력가능 
	 * Scanner.nextLine() : 공백포함해서 문자열 한개 입력
	 * Scanner.nextint() : int형 정수 한개입력 
	 * Scanner.nextLong(): long형 정수 1개 입력
	 * Scanner.nextDouble(): 실수 한개 입력
	 * 
	 * 이외에 Scanner 클래스 안에는 여러가지 기능이 존재
	 * 스캐너는 불러온 다음 Close를 사용해서 공간을 닫아주는 
	 * 표시를 하는게 좋음 
	 */
	
	 //Scanner 사용 하기
		
	//1. class 위에 import구문이 생겨야함 
		
	//2. Scanner 객체 사용
	Scanner sc = new Scanner(System.in);
	//3. system.in 키보드로 입력하는 값을 받을수있도록 허용
	System.out.print("정수 입력: 1");
	int num1 =sc.nextInt();//다음에 입력된 정수를 가져와 
	                 	   //num1에 대입
	System.out.print("정수 입력 2 :");
	int num2 =sc.nextInt();
	//실수 입력 nextDouble을 사용해서 num3 값에 실수입력하기
	System.out.print("실수 값");
	double num3 = sc.nextDouble();
	//단어 입력 2개하기 next 사용해서 변수면 word1 word2
	System.out.println("단어 입력 2개 하기:");
	String word1=sc.next();
	//Scanner 이용해서 입력을 진행할 경우 
	//system.out.print를 이용해서 제대로 값이 입력됐는지
	//문제는 없는지 확인 출력을 하는게 좋음
	String word2=sc.next();
	
	//***********************
	//- nextInt() /nextDouble등을 작성한 이후
	//nextLine() 을 작성해야되는 상황이 오면 
	//nextLine() 을 미리 한번 작성하고 사용하기
	
	sc.nextLine();//next() 뒤에 남아있는 버퍼값을 Line안에 넣어줌
	//그런데[ 버퍼값은 우리가 눈으로 보거나 저장을 해야할 이유가 없기 떄문에
	//앞에 자료형이나 변수명을 사용해서 버퍼를 넣어 저장해야할 이유가
	//없어 sc.nextLine()으로만 사용
	
	//nextLine()을 호출해서 남아있던 엔터를 제거 
	
	System.out.println("문장 입력 : ");
	String str= sc.nextLine();
	
	
	
	//4. system.out 으로 내용 출력하기
	System.out.println("정수 1의 값 : " + num1 );
	System.out.println("정수 2의 값 : " + num2 );
	System.out.println("실수 값 : " +num3);
	System.out.println("단어2개 입력 하기 : " +word1+word2);
	System.out.println("추가된 문장 :" +str);
		
	//5. Scanner close 사용해서 닫아주기 
	
	//scanner 사용을 다 했다면 공간을 차지하지 않기위해서
	//scanner를 종료하는 close를사용해서 닫아주기
	sc.close();
	
	}

}
