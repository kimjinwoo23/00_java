package com.kh.ExceptionEx;
/*
 Exception에서 try catch finally
 
 try ctrl space 
 
 try{
 예외가 발생할순있지만 실행하는 코드  
   
 }catch(Exception e) { 
 예외가 생겨서 출력이나 실행하는 코드
 
  }finally{
  예외 발생과 관계없이 무조건 실행하는 코드 
  파일닫기 , 연결종료 등 
  
  
  }
  
  
  
 */
public class ExceptionFinallyEx {
 
	public static void main(String[] args) {
		try {
			int 결과 = 10/0;
	
		}catch(Exception e) {
			System.out.println("죽어라 벌레같은 놈");
		}finally {
			System.out.println("불의군주 라그나로스");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
