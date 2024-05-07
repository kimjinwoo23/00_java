package com.kh.example.practice4.run;

import com.kh.example.practice4.mode.vo.Student;

public class Run {

	public static void main(String[] args) {

		
	Student st = new Student();	
		st.setName("홍길동");
		st.setGrade(3);
		st.setClassroom(2);
		st.setHeight(200.5);
		st.setGender('남');
		
		st.information();
	
	
	
		
	}
	
	

}
