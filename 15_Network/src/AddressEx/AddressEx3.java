package AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {

	public static void main(String[] args) {
		
		try {
			InetAddress 주소이름 =InetAddress.getByName("www.google.com");
		
			System.out.println("getByName 으로 구글을 가져온 이름 : " + 주소이름);
		
			//getByName은 영어주소와 숫자주소를 한번에 가져옴 
			//getLocalHost를 이용해서 내 집주소를 가져오고 집주소에대한 상세정보 확인 
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println("내 집주소 : " + 내집주소);
			
			//멀티캐스트 주소 여부확인 
			//byte[] 주소를 활용한 객체가져오기 
			//루프백 주소 현재 컴퓨터 자체를 가리킴 외부연결을 하지않고 내 컴퓨터 사용 
			//한 컴퓨터에서 2개이상의 컴퓨터에 동시로 파일전송하는방법 
			
			byte[] ipAddress = {127,0,0,1};
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
			
			
			
			System.out.println(내집주소);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
