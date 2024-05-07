package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

public class PersonController {

	// 학생자리 3개
	private Student[] students = new Student[3];

	private int studentIndex = 0;

	public int[] personCount() {
		int[] counts = new int[2];
		counts[0] = studentIndex;
		counts[1] = 0;
		return counts;

	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		// 학생수 추가하기
		// 배열로 쳤을때 index 값이 legnth보다 초과되면 넣지못하게한다
		if (studentIndex < students.length) {
			students[studentIndex++] = new Student(name, age, height, weight, grade, major);
		} else {
			System.out.println("더이상 학생을 추가할수 없습니다");
		}
	}

	// 학생 목록보기
	public Student[] printStudent() {
		return students;
	}

}
