package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
	}
	//void 학생정보와 성적결과 출력
	public void printStudentMenu() {
		System.out.println("학생 이름 과목 점수 ");
		System.out.println("~~~~~~~~~~~~~~~");
		//for - each
		//String은 단일개체의 학생의 이름 과목 점수중 하나를가져오지만
		//Student 는 이름 과목 점수 모두 가지고온다 
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
	}
	System.out.println("~~~~~~~~~~~~~~~~~");
	System.out.println("총점 : " + ssm.sumScore());
	System.out.printf("평균 : %.2f "  , ssm.avgScore()[1]);
	System.out.println("합격여부 : " + (ssm.avgScore()[1]>=StudentController.CUT_LINE));
	ssm.printPass();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
