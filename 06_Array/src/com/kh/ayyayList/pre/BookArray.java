package com.kh.ayyayList.pre;

public class BookArray {

	
	public static void main(String[] args) {
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드" ,"손워평");
		책들[1] = new Book("불변의 법칙" , "모건 하우철");
		책들[2] = new Book("나는 읽고 쓰고 버린다" , "손웅정");
		
		System.out.println(책들);//컴퓨터에서 책들 배열의 주소
		//for문의 경우 여러책들 중에서1 권만 가지고오기떄문에
		// 맨 앞에 자료형에 배열을 붙이지않음
		for(Book 책  : 책들) {
			System.out.println(책);
			System.out.println(책.getAuthor());
			System.out.println(책.getBookName());
		}
				
				
	}
	
}
