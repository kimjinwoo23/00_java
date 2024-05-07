package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {

	public static void main(String[] args) {
		String 헬로우월드 = "나는 자바가 재밌다";
		String 월드 = "나는나는재미재미있다있다";
		try {
			FileWriter ap = new FileWriter("Hello World.txt",true);
			
			ap.write(헬로우월드);
			ap.close();
			System.out.println("끝");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
}
