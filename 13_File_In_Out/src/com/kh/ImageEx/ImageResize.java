package com.kh.ImageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 BufferedImage : 이미지 데이터를 저장하고 처리하는데사용
 Image: 인터페이스로 이미지를표현하는 추상화된 개념
 ImageIO:이미지를 파일로부터 읽고 출력하는 이미지 IN out
 
 
 
 */
public class ImageResize {

	public static void main(String[] args) {
		
		String 원본이미지 = "src/com/kh/ImageEx/marley.jpg";
		String 사이즈조정이미지 = "src/com/kh/ImageEx/marley_cute.jpg";
		
		//이미지 가로 세로 크기 설정
		int 가로크기 = 200;
		int 세로크기 = 200;
		
		//버퍼이미지를 통해서 이미지 불러오기 
		try {
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			//새로운크기의 이미지 생성
			BufferedImage 크기조정이미지 = new BufferedImage(가로크기,세로크기,BufferedImage.TYPE_INT_RGB);
			
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로크기, 세로크기, Image.SCALE_SMOOTH);
			
			크기조정이미지.createGraphics().drawImage(이미지그리기,0,0,null);
			
			 //새로만든 이미지를 파일로 저장하기
			ImageIO.write(크기조정이미지, "jpg", new File(사이즈조정이미지));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
