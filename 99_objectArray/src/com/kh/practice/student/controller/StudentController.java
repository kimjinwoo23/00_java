package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	//5개가 들어갈 배열 생성 
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE =60;//상수
	
	public StudentController() {
	
		
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50); 
		sArr[2] = new Student("이길동","화면",85); 
		sArr[3] = new Student("정길동","서버",60); 
		sArr[4] = new Student("홍길동","자바",20);
	}
	//반환 메서드 
	public Student[] printStudent() {
		return sArr;
	}
	//학생들의 점수를 모두 더해서 총점을계산
	public int sumScore() {//점수를 합한 값
		int sum = 0;
		
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//sumScore을 부른다면 점수를 보여준다
		return sum;
	}
	//총점을 받아서 평균 구하기 
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //총점 저장
		avgArr[1] = avgArr[0] / sArr.length;//총점을 총 학생수로 나눈 것
		
		return avgArr;
	}
	//각 학생의 합격여부를 확인하고 출력하기 
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은" + (s.isPassed() ? "통과" : "불합격"));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
