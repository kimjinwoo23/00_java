package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		//product 객체생성
		Product product = new Product();
		
		product.setpName("사과");
		product.setPrice(2000);
		product.setBrand("유기농마을");
		
		product.information();
		
		System.out.println("get불러오기");
		System.out.println("이름 : " + product.getpName());
		System.out.println("가격 : " + product.getPrice());
		System.out.println("브랜드 : " + product.getBrand());
		
		
	}

}
