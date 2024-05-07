package com.kh.Oop.basic;

public class Animal {
	
	//필드 이름 나이 
	public String name;
	public String age;
	
	//초기 생성자
	public Animal() {
		
	}
	//3. 필수생성자 
		public Animal(String name, String age) {
			this.name = name;
			this.age = age;
		}
	//출력 메서드 public void Info(){이름과 나이 출력
		public void Info() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			
		}
		
		
	//5.메인 메서드 
		public static void main(String[] args) {
			Animal random = new Animal("다섯살","똘이");
			
			
			random.Info();
			
			Animal random2 = new Animal("3살", "고양이");
			
			random2.Info();
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
