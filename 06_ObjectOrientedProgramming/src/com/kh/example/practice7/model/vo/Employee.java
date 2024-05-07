package com.kh.example.practice7.model.vo;

public class Employee {

	public int empNo;
	public String empName;
	public String dept;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String address;
	
	//생성자
	public Employee() {
		
	}
	//번호와 이름을 필수로 추가 번호와 이름이외는 필수가아님
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	
	}
	public Employee(int empNo,String empName, String dept
			,String job, int salary,char gender,String phone,
			String addrees) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.bonusPoint = bonusPoint;
		this.address = addrees;
		this.phone = phone;
		
				
		
		
		
	}
	
	
	
	
}
	
	  
	  
	