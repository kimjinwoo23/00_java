package SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		//대화 주체자는 나의 집 주소와 포트번호 어떻게 들어올지 경로(포트번호)생성 
		//서버측의 포트 번호를 지정해서 ServerSocket생성 
		
		try {
			ServerSocket s = new ServerSocket(12348);
			
			//System.out.println("주최자 번호 오픈 ");
			System.out.println("Party chat open");
			
			//우리집에 들어오는 손님의 연결을 수락하기 
			Socket b = s.accept();
			System.out.println("client success");
			
			//주최자와 대화를 하기위한 입출력스트림생성
			//1.참가자.getInputStream():참가자가 작성한 데이터를 읽어오기위한 입력스트림을 가져옴 
			//2.InputStreamReader:하나씩된 단어들을 숫자에서 문자로 변환함
			//3.BufferedReader : 하나씩된 데이터를 한번에가져오고 읽을수있도록 도와줌
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			
			//작성한 내용을 볼수있게 내보내고 눈으로읽게해줌 
			//1.참가자.getOutputStream(),true : true가 참가자의 내용을 내보냄 
			
			PrintWriter out = new PrintWriter(b.getOutputStream(),true);
			String m ; // = in.readLine();
			out.println("hi");
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m );
				
				
				
			}
			
			
			
			
			in.close();
			out.close();
			b.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
			
	
		
		
		
	}
	
	
	
	

