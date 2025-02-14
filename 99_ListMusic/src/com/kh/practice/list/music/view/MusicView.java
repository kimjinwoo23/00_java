package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
//스캐너로 원하는 음악 관리 번호를 입력하기
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("~~~음악 관리 프로그램~~~");
			System.out.println("1. 음악 추가 ");
			System.out.println("2. 첫 번째 위치에 음악 추가  ");
			System.out.println("3. 전체목록추가");

			System.out.println("9, 프로그램 종료 ");
			System.out.println("메뉴선택 :  ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				//전체목록출력;
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("잘못된 선택입니다");
			}
						
		}
	}
	public void addList() {
		System.out.println("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		
		//곡과 가수 저장하기 
		mc.addList(title,singer);
	}
	//첫번째 위치에 음악 바로 추가하기
	public void addAtZero() {
		System.out.println("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		
		mc.addAtZero(title,singer);
	}
	public void printAll() {
		System.out.println(mc.printAll());
	}
	public searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title))
			return music;
		}
		return null;
	}
		
}
