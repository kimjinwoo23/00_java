package com.kh.ImageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
	
	/*
	 바탕화면에 이미지폴더/ 동물이름 txt 로 파일생성후
	 동물이름 소 고양이 돼지 토끼 호랑이 이름을 \n써서 생성후
	 동물이름 생성 
	 좋아하는 동물 이름으로 폴더이름 변경
	 삭제
	 
	 */
	
	public static void main(String[] args) {
		File 동물이름 =  new File("c:/Users/user1/Desktop/동물이름");
		System.out.println("파일이 존재하나요 ? " + 동물이름.exists());
		
		if(동물이름.exists()) {
			System.out.println("폴더가 이미 존재합니다");
		}else {
			동물이름.mkdir();
		System.out.println("폴더 생성 성공");
		}
		String 바탕화면경로 = System.getProperty("user.home") +"/Desktop"; 
		File 동물이름1 = new File(바탕화면경로 + "/newAnimal/동물이름1.txt");
		File 고양이1 = new File(바탕화면경로 + "/newAnimal/고양이1.txt");
		
		if(동물이름1.exists()) {
			
			if(동물이름1.renameTo(고양이1)) {
				System.out.println("성공적으로 변경했습니다");
			}else {
				System.out.println("이름변경에 실패했습니다");
			} 
				
			}else {
				System.out.println("파일을 찾지못했습니다");
			}
		
		
		
		
	
		
		
		try {
			FileWriter 동물 = new FileWriter("동물이름.txt",true);
			String 고양이 = "고양이/n돼지/n토끼/n호랑이/n소";
		동물.write(고양이);
		동물.close();
		
		System.out.println("끝");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
}
