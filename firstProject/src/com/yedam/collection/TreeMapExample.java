package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeMap<Integer, String> scores = new TreeMap<>();
			scores.put(new Integer(87),  "최재영");
			scores.put(new Integer(98),  "민해주");
			scores.put(new Integer(75),  "김상민");
			scores.put(new Integer(95),  "최형준");
			scores.put(new Integer(80),  "허성준");
			
			//Map.Entry<키, 값>
			Map.Entry<Integer, String> entry = scores.firstEntry(); //최솟값(75)
			System.out.println("점수 : " + entry.getKey() + 
					         ", 이름 : " + entry.getValue());
			
			Integer icnt = scores.firstKey();
			scores.get(icnt);
			System.out.println("점수 : " + icnt + 
							 ", 이름 : " + scores.get(icnt));
			
			Map.Entry<Integer, String> pEntry = scores.pollFirstEntry(); //
			System.out.println("점수 : " + pEntry + 
					   	 	 ", 이름 : " + pEntry.getValue());
	}
}
