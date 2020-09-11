package com.yedam.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 30000; i++) {
			aList.add(0, new Integer(i));
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime));
		
		
		List<Integer> bList = new LinkedList<>();
		long startTime2 = System.nanoTime();
		for(int i = 0;i<30000;i++){
			bList.add(0, new Integer(i));
		}
		long endTime2 = System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime2-startTime2));
		}
	}

	
