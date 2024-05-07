package AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 내 집주소 알아보기
 InetAddress.getLocalHost(): 현재 내 컴퓨터에 지정된 IP주소를가져오는 메서드 
 내 IP주소:내 아이피주소 : 192.168.0.24
 기본으로 컴퓨터가 동일한 선에서 1대일 때는 마지막이 1로시작하는 숫자를받지만 
 여러사람이 함께 같은공간에서 각각다른번호를 부여받음 
 192.168.0.24의 경우 내 집에있는 호수를 가리켜서 사용함 
 
 127,0,0,1 = 숫자로 우리집 = localhost = 192.168.0.24
 
 */
public class AddressEx2 {

	public static void main(String[] args) {
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
		
			System.out.println("내 아이피주소 : " + 로컬호스트.getHostAddress());
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			InetAddress sns = InetAddress.getByName("www.instargram.com");
			System.out.println("인스타그램 : " + sns.getHostName());
			System.out.println("인스타그램주소 : " + sns.getHostAddress());
			
			InetAddress sns1 = InetAddress.getLocalHost();
			
			System.out.println("페이스북 " + sns1.getHostName());
			System.out.println("페이스북 " + sns1.getHostAddress());
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
}
