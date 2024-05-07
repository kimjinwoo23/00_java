package com.kh.ayyayList.pre;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookArrays {

	public static void main(String[] args) {
		
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드" ,"손워평");
		책들[1] = new Book("불변의 법칙" , "모건 하우철");
		책들[2] = new Book("나는 읽고 쓰고 버린다" , "손웅정");
		
		Book[] 무지개도서관 = Arrays.copyOf(책들, 책들.length);
		
		System.out.println("~~~~~~~~~~~~~~~~");
		
		for(Book 책   : 무지개도서관) {
			System.out.println(책.getBookName() + " ," + 책.getAuthor());
		}
		boolean same = Arrays.equals(책들, 무지개도서관);
		System.out.println("책이 같은가요" + same);
		//									새로운 length 0이면 없음
		//									1이면 하나 2면 두개 3이면 세개
		Book[] 주황도서관 = Arrays.copyOf(책들, 2);
		System.out.println(Arrays.toString(주황도서관));
		for (Book 책    :  주황도서관) {
			System.out.println(책.getBookName()+ " " + 책.getAuthor());
		}
		
		
		
		
		
		
		
		
	}

}
