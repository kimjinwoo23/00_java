package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

/*
 File Writer : 파일에 문자를 쓰기위한 객체 
 파일이 없다면 파일을 생성하고 파일에 데이터를 바로 쓸 수 있음
 
 메서드 
 write() :작성하고싶은 내용을 파일안에 작성 
 flush() : 스트림을 비우고 모든 데이터를 출력
 close(): 쓰고있는 파일을 닫음
 
 */
public class FileWriteEx {

	public static void main(String[] args) {
	
		try {			//파일명.확장자,true를 붙이면 이어서 작성
			FileWriter 글쓰기 = new FileWriter("예제파일.txt");
			//파일이름 앞에 주소가없으면 자바코드를 작성하는 폴더 바로밑에 생성됨
			//파일에 글자쓰기 
			글쓰기.write("하이요");
			글쓰기.close();
			System.out.println("글쓰기 끝");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
