package com.kh.practice.File.model.dao;

import java.util.*;

public class FileDAO {

	private Map<String,String> files = new HashMap<>();
	
	//파일이름이 존재하는지 containsKey
	public boolean checkName(String file) {
		return files.containsKey(file);
		
	}
		//파일저장유무 확인 put 
	public void fileSave(String file,String s)
	{
		files.put(file, s);
		System.out.println("파일 저장 완료 : " + file);
	}
		
	//파일 열기 
	public StringBuilder fileOpen(String file) {
		if(files.containsKey(file)) {
			System.out.println("파일 열기 완료 " + file );
			return new StringBuilder(files.get(file));
		}else {
			System.out.println("파일이 존재하지않습니다");
			return new StringBuilder();
		}
	}
	//파일 내용 수정 
	public void fileEdit(String file, String s) {
		if(files.containsKey(file)) {
			files.put(file, s);
			System.out.println("파일편집완료 : " + file);
			
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
	}
	
	
}
