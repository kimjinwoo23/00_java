package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public void practice1() {
		//for 문을 활용한 배열출력하기
		int numbers[] = new int[5];
		//0~4 배열에 숫자넣기
		//최대길이를 구하는건 length(문자열의 길이)
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
			
			
		}
		
		}
		
		
		
public static void practice17() {
			
	String[] chickenMenu = {"양념치킨","후라이드치킨","간장치킨"};
			
	Scanner sc = new Scanner(System.in);
	System.out.println("치킨이름을 입력하세요");
	String inputchis = sc.next();
			
	//배열에 사용자가 입력한 치킨이 있는지 검색
			
	boolean found = false;
	
	//for-each 문을 써서 치킨이 있는지 확인 
	for(String ab :chickenMenu) {
		//System.out.println(ab);
		if(ab.equals(inputchis)) {
			found =true;
			break;
		}
			
	}
		
	

	
	
	//만약에 치킨이 존재한다면 found = true; break;
	//만약에 치킨이 존재한다면 배달가능출력 
	if(found) {
		System.out.println(inputchis + "배달가능합니다");
	}else {
		System.out.println(inputchis + "은 없는 메뉴입니다");
	}
	//존재하지않는다면 oo치킨은 없는메뉴입니다 출력 
	
			
	
}
		
		
		
		
		
		
		
		
		
		
		
public static void main(String[] args) {
	practice17();
		
		
		
	}

}
