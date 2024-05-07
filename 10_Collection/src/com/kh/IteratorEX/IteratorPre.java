package com.kh.IteratorEX;

import java.util.*;

/*
 파일위치를 가져올때 동일한 폴더위치에서 
 많은 파일을 가져올때는 *를사용해서 
 모두 가져와기를 해준다 
 * = 전체선택 
 
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {

	public static void main(String[] args) {
		
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100,10,20,30,50,70));
		
		
		Iterator<Integer> 반복하기 = 숫자들.iterator() ;
		System.out.println(반복하기);
		
		while(반복하기.hasNext()) {
			int 숫자 = 반복하기.next();
				System.out.println(숫자);
				
		}
		
	}
	
	
	
	
	
	
}
