package com.kh.array;

import java.util.Scanner;

public class Practice {

	
	
		
		public void practice1(){
		
		int numbers1[] = new int [10];
		
		for(int i = 0; i< numbers1.length; i++) {
			numbers1[i] = i+1;
			System.out.println("numbers1 = " + numbers1[i]);
		}
	}
		public static void practice2() {
		int numbers1[] = new int [10];
		for(int i = 0; i < numbers1.length; i++) {
			numbers1[i]   = numbers1.length - i;
			//numbers1[1] =      10          -1; 
			System.out.println("numbers1[" + i + "] = " + numbers1[i]);
}
}
		public static void practice3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 하나를 입력해주세요");
			int size = sc.nextInt();
			
			int numbers[] = new int [size];
			for(int i = 0; i < size; i++) {
				
				numbers[i] = i+1;
			System.out.println(numbers[i]+ " ");
				
			}
			
			
		}
	
		public static void practice4() {
			String[] fruits = {"사과", " 귤", "포도" , "복숭아" , "참외"};
			System.out.println(fruits[1]);
		}
	
		
		public static void practice5() {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("문자열을 입력하세요");
			String answer = sc.next();
			System.out.println("검색할 문자를 입력하세요");
			String ao = sc.next();
			
	
			
			
		}
		
		
		public static void practice7() {
			
			int[]num = new int[7];
			//랜덤으로 숫자출력하는 방법
			//1. Random객체 사용:넓은 범위에 랜덤적용
			//Math 객체에서 random()메서드 사용:조금 더 작은범위에 랜덤적용
			for (int i = 0; i <num.length; i++ ) {
				num[i] = (int)(Math.random() *45+1);
				System.out.println("num[" + i + "] = "  + num[i]);
			}
}

		
		
		
		public static void method1() {
			//정수 0 1 2 10 20 30 출력
			int[] num = new int[3];
			 System.out.println(num);
			 System.out.println(num[0]);
			num[0]=10;
			System.out.println(num[1]);
			num[1]=20;
			System.out.println(num[2]);
			num[2]=30;
			//문자열 각자리에 월 화 수 목 금 토 일 
			//각 자리에 어떤 요일이 들어가있는지 출력
			String[] str = {"월","화","수","목","금","토","일"};
			//실수 index 2 까지 만들어주고 출력
			double[] dbl = new double[3];
			
			//문자 'A''B''C'넣은후 각 자리 출력
			char chr[] = {'A','B','C'};
			for(int i = 0; i<chr.length; i++) {
				System.out.println(chr[i] + " ");
			}
		
		}
		
		
		
		
		
		
		
public static void main(String[] args) {
	
	
	practice7();
	
	
	
}
	
}
