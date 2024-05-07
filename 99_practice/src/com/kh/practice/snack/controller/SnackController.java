package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.Snack;

public class SnackController {
	
	//snack객체 생성 > 기본 생성자> return메소드saveDate
	//return 메소드 confirmData
	
	private Snack s = new Snack();
	
	public SnackController() {
	}
	
	public String saveData(String kind, String name,String flavor
			,int numOf , int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return"저장 완료";
	}
	
	public String confirmData() {
		return s.information();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
