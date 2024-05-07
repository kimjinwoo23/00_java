package AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 IP주소 : 컴퓨터에서 네트워크에특정 장치를 확인하는데 사용하는숫자
 
우리집주소 =  가장 기본주소 192.158.0.1( localhost)
port = 네트워크에서 데이터를 주고 받을수있는 장소
타인의 컴퓨터나 도메인, 또는 특정위치에 들어갈수있는 번호

InetAddress: 자바에서 IP주소를 나타내는데 사용
호스트명 IP주소간의 변환 , 집주인의대한 정보검색등을 가능하게해줌
메서드명:
getByName(String host): host명에 대한 정보를 반환 
 
getHostName(): 호스트명을 가져옴

getHostAdress():IP주소를 가져옴 
 
 호스트명  : www.google.com
IP주소  : 172.217.25.4

영어로 된 이름 주소와 숫자로된 주소가 다른 사람이 검색했을경우 와 내가 검색했을때
주소가 다르게 나오는 이유는 해당IP주소를 보호하기위해 무작위로 보여주는 주소기떄문


 
 
 */
public class AddressEx {

public static void main(String[] args) {
	
	//naver 에대해 알아보기 
	try {
		InetAddress 주소 = InetAddress.getByName("www.naver.com");
		System.out.println("호스트명 : " + 주소.getHostName());
		System.out.println("IP주소 : " + 주소.getHostAddress());
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//2.다음에대해 알아보기 
	try {
		InetAddress 다음주소 = InetAddress.getByName("www.daum.net");
		System.out.println("호스트명 : " + 다음주소.getHostName());
		System.out.println("IP주소 : " + 다음주소.getHostAddress());
	
	
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//IP주소로 다음 주소검색하기
	try {
		InetAddress 다음IP = InetAddress.getByName("121.53.105.193");
		System.out.println("호스트명 : " + 다음IP.getHostName());
		System.out.println("IP주소 : " + 다음IP.getHostAddress());
	
	
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	
	
}


















