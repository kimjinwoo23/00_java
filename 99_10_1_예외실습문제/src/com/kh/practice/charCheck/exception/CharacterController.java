package com.kh.practice.charCheck.exception;

public class CharacterController {

	public CharacterController() {
		
	}
	//문자열이 비어있을때 예외 상황 문구만들기
	public int countAlpha(String s)throws charCheackException {
		
		if(s == null||s.isEmpty()) {
			throw new charCheackException("문자열이 비어있습니다");
		}
		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if((c>='a'&& c<='z')||(c >= 'A' && c<='Z')){
					count++;
		}
		return 0;
	}
		return count;
	
	
	}
}