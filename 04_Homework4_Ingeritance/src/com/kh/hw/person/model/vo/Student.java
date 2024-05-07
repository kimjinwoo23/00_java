package com.kh.hw.person.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	public Student() {
	}
	public Student(String name, int age, double height, double weight,int grade, String major) {
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}
	@Override
	public String toString() {
		return "학생 이름" + getName() +"나이 " + getAge() + "키" + getHeight()
				+"몸무게" + getWeight() + "학년" +grade + "전공" + major;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
