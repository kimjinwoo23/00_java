package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {

	public static void main(String[] args) {
		
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("키위" ,"복숭아" ,"참외" ,"수박", "딸기"));
		System.out.println(과일들);
		과일들.remove("복숭아");
		
		System.out.println(과일들.contains("수박"));
		
		System.out.println(과일들.isEmpty());
		
		System.out.println(과일들.size());
		
		System.out.println("가장작은 값 : "  + 과일들.first());
		System.out.println("가장큰 값 : "  + 과일들.last());
		
		
	
	}
	
}
