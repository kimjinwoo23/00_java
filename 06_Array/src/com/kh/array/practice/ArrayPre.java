package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {

	
	public ArrayPre() {
		
	}
	
	public void practice1() {
		//배열을 사용해서 전체 합 구하기 
		//배열을 사용할때 제일먼저 
		//숫자인지 문자열인지 문자인지 실수인지 구분하고[]작성
			//index  0 1 2 3 4  length=5
		int[] num = {1,2,3,4,5,};
		int result = 0;
		
		for(int 숫자 : num) {
			//num안에있는 모든숫자가 하나씩 숫자안에 들어가고
			//숫자들의 합을 구한다
			result += 숫자;
		}
		System.out.println("숫자들의 합 " + result);
		
	}
	
	
	public void practice2() {
		
		//ArrayList로 사용해서 물건 추가하기
		ArrayList<String> goods = new ArrayList<>();
		//상품을 추가할떄는 add 
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("T V ");
		goods.add("에어컨");
		
		System.out.println(goods);
		
		//for-each문을 활용해서 사용 
		for(String ad :goods) {
			System.out.println(ad);
			
		}
		
		
		
		
	}
	
	
	public void practice3() {
		//배열을 사용해서 최대값찾기
		int[] numbers = {3,7,2,9,1};
			
		int max = numbers[0];
		
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
			
		}
		System.out.println("최대값은 : " + max);
		
		
		
		
	}

	
	public void practice4() {
		//찾음 못찾음 
		//과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과","바나나","딸기","오렌지"};
		
		String search = "바나나";
		boolean found = false;
		
		for(String f : fruits ) {
			if(f.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + " 찾음? " + (found ? "yes" : "no"));
		
		
		
	}
	
	public void practice5() {
		//스캐너로 동물을 입력하고 배열에 동물이있는지 확인
		Scanner sc = new Scanner(System.in);
		
		String[] zoo = {"코끼리","원숭이","푸바오","토끼","공작"};
		System.out.println("동물을 입력해주세요");
		
		String ad = sc.next();
		boolean found = false;
		
		for(String po :zoo) {
			if(po.equals(ad)) {
				found = true;
				break;
			}
		}
		System.out.println(ad + " 을 찾았나요"  + (found ? "yes":"no"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
