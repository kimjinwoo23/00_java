package com.kh.Oop.basic;

public class Bank {
	//이름 계좌번호 잔액 비밀번호 마케팅수신동의 
	public String name;
	public String accountNumber;
	public String password;
	public String balance;
	public boolean agreel;
	
	//생성자 메서드
	//1. 필수가아닌 생성자 
	//2.필수인 생성자 : 이름 잔액 계좌번호 패스워드
	//3. 출력 생성자 
	
	
	public Bank(String name, String accountNumber
			,String password, String balance ) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
		
	}
	public Bank() {
	}
	public void Info() {
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("패스워드 : " + password);
		System.out.println("수신동의 : " + agreel);
		
	}
	
	//4. 메인
	public static void main(String[] args) {
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = "123";
		customer1.password = "0000";
		customer1.agreel = true;
		
		//customer1.Info();
		
		
		Bank customer2 = new Bank();
		customer2.name ="dan";
		customer2.accountNumber = "111-110-1234";
		customer2.balance = "1000";
		customer2.password = "1234";
		
		//customer2.Info();
		
		Bank customer3 = new Bank();
		//Bank() 안에 아래있는 이름 계좌번호 잔액 비밀번호를 넣어서 간단하게 가능
		customer3.name = "마이클";
		customer3.accountNumber = "999-999-9999";
		customer3.balance = "3333";
		customer3.password = "2345";
		customer3.agreel = true;
		
		customer3.Info();
	}
	
	

}
