package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("맛동산");
		set.add("양파깡");
		set.add("오징어땅콩");
		set.add("알새우칩");
		set.add("고래밥");
		set.add("새우깡");
		set.add("새우깡");
		set.add("새우깡");
		set.add("새우깡");
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set.contains("맛동산"));
		System.out.println(set);
		set.remove("고래밥");
		
		
		System.out.println(set.isEmpty());
		System.out.println(set);
		
	}
	
}
