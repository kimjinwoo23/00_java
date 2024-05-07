package com.kh.JavaAPIEx;

public class StringPre {

	public static void main(String[] args) {
			//substring 메서드로 문자열의 일부 투데이만 추출
		String 문제1 = "Today is a beautiful day";
		
		String a = "Today is a beautiful day".substring(0,5);
		System.out.println(a);
	
			//toUpperCase  메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String b = "Programming is fun and challenging".toUpperCase();
		System.out.println(b);
		
			//toLowerCase  메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String c = "Learning new things is exciting".toLowerCase();
		
			//split 활용해서 문자열을 "  " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] d = "A good medicine tastes bitter".split("  ");
		for(String dd : d)
		System.out.println(dd);
		
		
		
		 	//replace 활용해서 more 을 less로 대체 
		String 문제5 = "The more, the better";
		String e = "The more, the better".replace("more", "less");
		System.out.println(e);
		
		
			//charAt을 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls haver ears";
		char f = "Walls haver ears".charAt(6);
		System.out.println(f);
		
			//substring 메서드로 his부터 끝까지 추출 
		String 문제7 = "Every dog has his day";
		String g = "Every dog has his day".substring(14);
		System.out.println(g);
		
		
	}

}
