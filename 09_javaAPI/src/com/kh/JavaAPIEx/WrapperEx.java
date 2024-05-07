package com.kh.JavaAPIEx;
/*
 Wrapper =감싸다
 기본 데이터타입: primitivetypes
 기본 자료형 타입을 객체로감싸서 사용할수있는 클래스 
 기본 자료형인 int,double,cher,short,long,float
 ArratList 부를떄 사용 많이함
 
 
 
 */
public class WrapperEx {

	
	public static void main(String[] args) {
		Byte 바이트값 = 10;
		//객체로 된 값을 객체가아닌 byte로 쓸때
		byte 기본바이트값 = 바이트값.byteValue();
		System.out.println("바이트값 : " + 바이트값);
		System.out.println("기본바이트 값 : " + 기본바이트값);
		
		
		Short 쇼트값 = 20;
		short 기본쇼트값 = 쇼트값.shortValue();
		System.out.println("쇼트값 : " + 쇼트값);
		System.out.println("기본쇼트값 : " + 기본쇼트값);
		
		//Integer
				Integer 인테져값 = 30;
				int 기본인테져값 = 인테져값.intValue();
				System.out.println("   인테져값 : " + 인테져값);
				System.out.println("기본인테져값 : " + 기본인테져값);
				//Long
				Long 롱값 = 40L;
				long 기본롱값 = 롱값.longValue();
				System.out.println("   롱값 : " + 롱값);
				System.out.println("기본롱값 : " + 기본롱값);
				//Float
				Float 플롯값 = 50.5f;
				float 기본플롯값 = 플롯값.floatValue();
				System.out.println("   플롯값 : " + 플롯값);
				System.out.println("기본플롯값 : " + 기본플롯값);
				//Double
				Double 더블값 = 60.6;
				double 기본더블값 = 더블값.doubleValue();
				System.out.println("   더블값 : " + 더블값);
				System.out.println("기본더블값 : " + 기본더블값);
				Character 캐릭터값 = 'A';
				char 기본캐릭터값 = 캐릭터값.charValue();
				System.out.println("   캐릭터값 : " + 캐릭터값);
				System.out.println("기본캐릭터값 : " + 기본캐릭터값);
				//Boolean
				Boolean 불리언값 = true;
				boolean 기본불리언값 = 불리언값.booleanValue();
				System.out.println("   불리언값 : " + 불리언값);
				System.out.println("기본불리언값 : " + 기본불리언값);
			}
		
		
	}
	
	
	
	
	
	
	
	

