package com.kh.JavaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 Date : 특정 날짜와 시간을 나타내는 클래스
 calender : 날짜와 시간을 조작하는데사용하는 추정클래스
 simpleDateFormat : 날짜와 시간을 형식으로 보여주고 출력
 GregorianCalender: 그레고리력을사용해서 날짜와 시간을계산
 LocalDate:
 */
public class DateEx {

	public static void main(String[] args) {
		//1.Date 
		Date 현재데이트 = new Date();
		System.out.println(현재데이트);
		//2.Calendar
		Calendar 캘린더 = Calendar.getInstance();
		int 년 = 캘린더.get(Calendar.YEAR);
		int 월 = 캘린더.get(Calendar.MONTH);//0월부터 가져오기때문에 +1을해야함
		int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재날짜 : " + 년 + "/" + 월+1 + "/" +  일);
		
		GregorianCalendar 그레고리안1 = new GregorianCalendar();
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024,4,23);
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK);
		System.out.println("날짜 : " + 날짜);
		
		//4.simpleDateFormat
		/*
		 년:y 
		 월:M
		 일:d
		 시: H
		 분: m 
		 초: s
		 요일: E 
		 만약 o요일을 쓰고싶다면 EEEE를사용
		 
		 */
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜형식 지정해서 표시하기 : " + 날짜표시);
		

		//5. LocalDate 현재 날짜가져오기
		LocalDate 현재날짜는 = LocalDate.now();
		System.out.println("현재날짜는 : " + 현재날짜는);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
