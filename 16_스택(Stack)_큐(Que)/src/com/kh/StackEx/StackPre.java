package com.kh.StackEx;

import java.util.Stack;

public class StackPre {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		
		s.push(10);
		s.push(30);
		s.push(50);
		s.push(40);
		s.push(20);
		
		System.out.println(s);
		
		int a = s.pop();
		
		System.out.println(a);
		
		int 가장큰값 = s.peek();
		System.out.println(가장큰값);
		
		boolean b = s.isEmpty();
		System.out.println(b);
		
		System.out.println(s.size());
		
	}
	
	
	
	
}
