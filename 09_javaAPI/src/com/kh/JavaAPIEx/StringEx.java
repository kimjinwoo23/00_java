package com.kh.JavaAPIEx;
/*
 String :문자열을 나타내는클래스 
 문자열을 생성하고 조작하는데 사용 
 String str = newString();-이 방식은 더 사용하지않음
 String str = "";
 
  */
public class StringEx {

	public static void main(String[] args) {
		
		//String str = new String();
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		//가비지 컬렉션
		//코딩에서 사용하고 사용되지 않는 것을 자동으로 없애는 것
		//Garbage 쓰레기 -> 사용되지 않아 그럼 필요가없네?
		// 버리자!
		String phone = "010";
		phone += "1234-5678";
		System.out.println(phone);
		/*
					    0 1 2 3 4 5 6 7 8 9 10 11
		String 문자열 = " H e l l o   W o r l d  !";	
		*/
		String 문자열 = "Hello World!";
		
		// 1. subString()
		String 서브스트링 = 문자열.substring(6);
		System.out.println(서브스트링);
							// 6부터 7까지만 보여준다는 의미
		String 서브스트링1 = 문자열.substring(6 ,8);
		System.out.println(서브스트링1);
		
		// 2. toUpperCase()
		String 대문자 = 문자열.toUpperCase();
		System.out.println("대문자 맞나요 ? " + 대문자);
		
		// 3. toLowerCase()
		String 소문자 = 문자열.toLowerCase();
		System.out.println("소문자 맞나요 ? " + 소문자);
		
		// 4. trim()
		String 공백가득 = "     Hello   World!     ";
		String 공백제거 = 공백가득.trim();
		System.out.println("공백제거 됐나요 ? " + 공백제거);
		
		//5.split 문자열 특정 구분자를 기준으로 분할해서 문자열배열로반환
		String 과일들 = "apple , banana , grape";
		String[] 과일배열 = 과일들.split(",");
		for(String 과일 : 과일배열) {
			 System.out.println(과일);
		}
		
		//6.replace 특정문자열을 새로운 문자열로 대체 
		String 헬로우월드 = "Hello,world";
		String 변경 = 헬로우월드.replace("Hello", "Hi");
		System.out.println(변경);
		
		
		//7.charAt 문자열에서 주어진 인덱스에해당하는 문자하나를 반환
		String 하이월드 = "Hi World";
		char ch = 하이월드.charAt(8);
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	

