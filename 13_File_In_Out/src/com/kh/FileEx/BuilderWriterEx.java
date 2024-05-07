package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 StringBuilder:속도가 빠름
 
 
 */
public class BuilderWriterEx {
	public static void main(String[] args) {
		//파일 생성
		String 파일이름 = "줄.txt";
		
		//StringBuilder를 사용해서 쓸 내용 작성
		StringBuilder 빌더 = new StringBuilder();
		빌더.append("첫번쨰 줄이어라. \n");
		빌더.append("두번쨰 줄이어라. \n");
		빌더.append("세번쨰 줄이어라. \n");
		
		
		try {
			BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(파일이름));
			
			long 시작시간 = System.nanoTime();
			
			
			//파일내용 작성 
			버퍼글쓰기.write(빌더.toString());
			
			long 종료시간 = System.nanoTime();
			System.out.println("총 소요시간 : " + (종료시간-시작시간));
			
			//파일닫기 
			버퍼글쓰기.close();
			System.out.println("파일에 내용을 작성했음");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
