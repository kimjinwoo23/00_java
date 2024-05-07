package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 List ArrayList 
 	Vector 
 	LinkedList 
 	
 */
public class ListPre {

	public void vertorEx() {
		Vector<String>벡터 = new Vector<>();//-사용권장
		//List<String>벡터 = new Vector<>();
		
		벡터.add("저글링");
		벡터.add("히드라");
		벡터.add("드론");
		System.out.println(벡터);
		
		
	}
	public void LinkedEx() {
	//	List<String> 링크 = new LinkedList<>();-아래를써라
		LinkedList<String> 링크 = new LinkedList<>();
		링크.add("뮤탈");
		링크.add("디파일러");
		링크.add("울트라리스크");
		System.out.println(링크);
		
		
	}
	public void ArrayEx() {
		
		ArrayList<String> 어레이 = new ArrayList<>();
		어레이.add("질럿");
		어레이.add("드라군");
		어레이.add("하이템플러");
		System.out.println(어레이);
		
	}
	
	
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.vertorEx();
		li.LinkedEx();
		li.ArrayEx();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
