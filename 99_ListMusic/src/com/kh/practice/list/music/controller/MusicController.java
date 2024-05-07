package com.kh.practice.list.music.controller;

import java.util.*;


import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
//음악 목록 
	List<Music>list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	//음악추가 
	public int addList(String title,String singer) {
		//  Music 객체에 넣어줘야함					DB에 성공하면 1 실패하면 0
		//					만약에 추가 성공이 됐다면   ? true : false
		return list.add(new Music(title, singer)) ?  1 : 0 ;
	}
	public int addAtZero(String title,String singer) {
		//목록에 추가하는데 맨앞에다가 다시 새로 자리값을 만들고 
		//내가 추가하는 값이 무조건 0 자리가 될수있도록 추가 
		list.add(0, new Music(title,singer));
		return 1;
	}//모든 음악출력
	public  List<Music> printAll() {
		return list;
	}//음악검색
	public void searchMusic() {
		System.out.println("검색할 곡명 입력");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
		
	}
	
}
	

	

