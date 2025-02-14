package com.kh.propertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 Properties = 속성또는 설정에 꼭 넣어야하는 값을 작성 
 
 Map이랑 비슷한 형태의 데이터를 관리하는데 사용 
 
 key(키)와 value(값)으로 이루어져있음 
 
 키와 값이 숫자가아니라 문자열인 형태로 가지고있음
 
 메서드 
 setProperty(String key, String value) :지정된 키와값으로 맵에 항목을추가
 
 getProperty(String key) : 주어진 키에대한 값을 반환 
 getProperty(String key,String value) :주어진 키에대한값을 전달하지만 
 									   해당키가없을경우에는 기본값을 보여줌
 load(InputStream in) :입력스트림에서 속성목록을 읽어옴
 store(OutputStream,String comment) : 출력 스트림에서 속성목록을 저장 
 
 Properties의 경우에는 프로그램이나 코드를 실행할때 필수로 설정해줘야하는 
 내용을 작성한후에 코드가 아니라 파일로 주로 존재함
 
 map은 주로 데이터를 다루지만 Properties의 경우 인증키나 회원인증번호를 보내기위해서 
 인증을 위해 필요한 내용을 작성해놓는 공간
 
 
 
 */
public class PropertiesEx {

	public static void main(String[] args) {
		
		Properties 설정 = new Properties();
		
		//설정파일 만들기 만약에 만들어진 설정.properties이 없다면 새로운파일생성됨
		try {
			//File 
			File 진짜파일만들기 = new File("설정.properties");
			//만약에 파일이존재하지않는다면 만들어주기 
			if(진짜파일만들기.exists()) {
				System.out.println("파일이 존재합니다 ");
			}else {
				System.out.println("설정파일이 없습니다 새로운 파일을 생성해주세요");
				진짜파일만들기.createNewFile();

			}
			
			FileInputStream 파일만들기 = new FileInputStream("설정.properties");
			설정.load(파일만들기);
			파일만들기.close();
			
			//관리자이름 비밀번호 가져올것 
			//만약 관리자이름과 비번이없다면 null로 나올것
			String 관리자이름 = 설정.getProperty("관리자이름");
			String 관리자비번 = 설정.getProperty("관리자비번");
			 System.out.println("관리자이름 : " + 관리자이름);
			 System.out.println("관리자비번 : " + 관리자비번);
			 
			 //만약 null값이 아무것도없는게 싫다면 설정값 변경가능 
			 설정.setProperty("관리자이름", "매니저");
			 설정.setProperty("관리자비번", "1234");
			 
			 //변경된 설정을 파일에 저장 
			 FileOutputStream 파일저장 = new FileOutputStream("설정.properties");
			 설정.store(파일저장, "새로 이름과 비번 저장 ");
			 
			 //파일저장 종료 
			 파일저장.close();
			 
			 System.out.println("관리자가 성공적으로 변경됐습니다 ");
			 
			 
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
}
