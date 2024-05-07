package SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//파티참가자
public class ClientEx {

	public static void main(String[] args) {
		
		
		
		
		try {
			//localhost와 127.0.0.1은 자신의 주소를 의미함
			//				접속하고자하는 컴퓨터 주소 , 포트번호
			Socket c = new Socket("localhost",12348);
			//주최자와 대화를 하기위한 입출력스트림생성
			//1.참가자.getInputStream():참가자가 작성한 데이터를 읽어오기위한 입력스트림을 가져옴 
			//2.InputStreamReader:하나씩된 단어들을 숫자에서 문자로 변환함
			//3.BufferedReader : 하나씩된 데이터를 한번에가져오고 읽을수있도록 도와줌
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			
			//작성한 내용을 볼수있게 내보내고 눈으로읽게해줌 
			//1.참가자.getOutputStream(),true : true가 참가자의 내용을 내보냄 
			
			PrintWriter out = new PrintWriter(c.getOutputStream(),true);
			String m ; // = in.readLine();
			out.println("aaa");
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m );
				
				out.println("aaaaaabbbccc ");
				
				
			}
			
			
			
			
			in.close();
			out.close();
			c.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
