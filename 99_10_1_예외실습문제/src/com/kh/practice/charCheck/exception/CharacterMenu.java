package com.kh.practice.charCheck.exception;

import java.util.Scanner;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		
		
		try {
			int count = controller.countAlpha(input);
			System.out.println("  '  " + input + " '에포함된 영문자 개수 : "+count);
			
			
		} catch (charCheackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				sc.close();
			}
		}
		
		
		
	}
	
	
	
	
	
	