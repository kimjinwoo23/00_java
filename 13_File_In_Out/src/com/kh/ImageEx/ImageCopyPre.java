package com.kh.ImageEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyPre {

	public static void main(String[] args) {
		
		String 원본이미지 = "src/com/kh/imageEx/hogam.jpg";
		String 복사이미지 = "src/com/kh/imageEx/hogam_cute.jpg";
		try {
			FileInputStream 파일읽기1 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기1 = new FileOutputStream(복사이미지);
			
		byte[] buffer = new byte[1024];
		
		int 길이;
		
		while( (길이 = 파일읽기1.read(buffer))  > 0         ) {
			파일쓰기1.write(buffer,0,길이);
			
		}	
		
			파일읽기1.close();
			파일쓰기1.close();
		
		
		
		System.out.println("이미지 복사가 완료되었습니다.");
	} catch (Exception e) {
		System.out.println("이미지 복사 중 오류가 발생했습니다.");
		e.printStackTrace();
	}
	
}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

