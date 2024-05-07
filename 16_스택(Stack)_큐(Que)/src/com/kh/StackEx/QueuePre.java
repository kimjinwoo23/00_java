package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(80);
		que.offer(60);
		que.offer(30);
		que.offer(20);
		
		int a = que.poll();
		System.out.println(a);
		
		int b = que.peek();
		System.out.println(b);
		
		boolean isEmpty = que.isEmpty();
		System.out.println(isEmpty);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
