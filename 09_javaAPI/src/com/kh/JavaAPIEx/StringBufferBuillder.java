package com.kh.JavaAPIEx;
/*

 StringBuffer :여러 쓰레드에서 동시에 사용해도 안전하게 작업처리
 StringBuilder:하나의 쓰레드에서 사용하는게 좋음 
 
 Thread : 컴퓨터 내에서 실행되는 독립적인 실행 흐름
 동기: 요청과 
 
 */
public class StringBufferBuillder {
	public class BufferBuilder {
		//무언가 행동을 진행할 때 메서드
		
		//바로 실행하고 출력하고싶어 -> main 
public void main(String[] args) {
	//1. StringBuffer
	StringBuffer buffer = new StringBuffer();
	buffer.append("Hello");
	buffer.append(" World");
	System.out.println(buffer.toString());
			
	//2. StringBuilder
	StringBuilder builder = new StringBuilder();
	builder.append("Hello");
	builder.append(" World");
	System.out.println(builder.toString());
			
		}

		

	}
	
	
	
	
}
