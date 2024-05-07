package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	//사용자한테 숫자를 입력받고 
	Scanner sc = new Scanner(System.in);
	//사람컨트롤러 가져오기
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("메인메뉴");
			 System.out.println("1. 학생메뉴");
			 System.out.println("0. 프로그램종료");
			 System.out.print("메뉴선택 해주세요");
			 int choise = sc.nextInt();
			 sc.nextLine();
			switch(choise) {
				case 1 : 
					//System.out.println("학생메뉴입니다");
					//다음 메뉴로 넘어가기위해선 system.out이아니라 넘어갈곳의 이름을 적기
					studentMenu();
					break;
				case 0 : 
					System.out.println("프로그램을 종료합니다");
					return;
				default :
					System.out.println("잘못된 입력입니다");
					
				
			}
		}
	}
	public void studentMenu() {
		while(true) {
			System.out.println("학생메뉴");
			System.out.println("1.학생 추가 ");
			System.out.println("2.학생 출력 ");
			System.out.println("0. 이전메뉴로 ");
			System.out.println("메뉴 선택 : ");
			int choise = sc.nextInt();
			sc.nextLine();
			
			switch(choise) {
			case 1 : 
				insertStudent();
				break;
	        case 2 : 
				printStudent();
				break;
			case 0 :
			System.out.println("이전메뉴로 이동");
			return;
			default :
				System.out.println("잘못된 입력입니다");
				
				
				
			}
			
			
		}
	}
	
	
	public void insertStudent() {
		System.out.println("이름 : " );
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("신장 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게 :");
		sc.nextLine();
		double weight = sc.nextDouble();
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.println("전공 : ");
		String major = sc.nextLine();
		sc.nextLine();
		
		//2번쨰로 학생추가 넣기 
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("학생이 추가되었습니다");
		
		
	}
	
	//학생이 얼마나 존재하는지 출력하기 
	public void printStudent() {
		//학생정보가 들어있는 Student 장바구니 모양의 배열 가져오기 
		Student[] students = pc.printStudent();
			System.out.println("학생목록");
			for(Student s :  students) {
				//만약에 비어있지않다면 학생들을 보여주기
				if(s != null) {
					System.out.println(s);
				}else {
					System.out.println("보여줄 학생 정보가없습니다");
				}
				
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
