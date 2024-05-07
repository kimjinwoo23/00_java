package com.kh.conditionEx;

public class ControlSwitch {
	/*
	 switch / case 
	 if문과 비슷하지만 형식이 일정하게 있는 조건 판단문 
	 
	 사용방법.
	 switch(입력변수) {
	 case 입력값 : 
	 	실행할 문장 
	 	break; // case 를 빠져나가기위한 장치 
	 	
	 	case 입력값 2 : 
	 	실행할 문장 
	 	break; // 만약에 break가 없다면 다음 case 를 실행할것 
	 	
	 	사용방법 2 
	 	case의 경우 다른 번호가 동일한 결과를 갖길 원한다면 
	 	case를 이어서 작성할 수 있음 
	 		case 1: case 2: case 3:
	 			sysout("케이스 1 2 3 에 대한 결과");
	 		defualt
	 			sysout("1 2 3 이외의 결과");
	 			
	 	break; 는 원하는 케이스를 만나면 case 에 맞는 조건을
	 	실행한 후 프로그램을 종료하길 원할 떄 사용 
	 	case에 관련된 결과를 실행하기전에 break를 호출하면
	 	에러가 발생함
	 	
	 	break와 return 
	 	break의 경우 switch 나 for 문 while 문에서 사용
	 	해당 case이외를 종료한다 
	 	reture 어디서든지 사용가능 
	 	값을 반환할수있고 메서드나 함수의 실행을 중단하고 호출한 곳으로
	 	값을 전달한다 
	 	메서드나 함수내에서 reture문이 실행돼면 
	 	그 이후 코드는 실행되지않음 
	 	
		
	 	default : 입력변수와 일치하는 값이 없을 떄 실행하는 옵션
	 		선택사항이며 필요에 따라 생략할 수 있음
	 		실행할 문장
	 		break; 
	 		(else 와 비슷한 행위를 진행함)
	 	
	 */
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		
		switch(day) {
		//조건에 해당하는 case 를 작성 
		case 1 : 
			dayString = "일요일";
		case 2 : 
			dayString="월요일";
		case 3 : 
			dayString = "화요일";
			//break;
		case 4 : 
			dayString = "수요일";
		default : 
			dayString = "잘못된 입력";
		
		
		}
		System.out.println("입력한 숫자는 "+ dayString + " 입니다. ");
		
		
		
		
		
		
		
	}

}
