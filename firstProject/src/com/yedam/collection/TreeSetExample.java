package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();  //TreeSet : 크다, 작다의 개념이 들어가있다. 정렬??
		
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.last();  //first 최솟값, last 최댓값
		t = tSet.first();
		t = tSet.floor(new Integer(87)); // <=
//		t = tSet.lower(new Integer(87)); // <
		t = tSet.ceiling(new Integer(85)); // >=
		t = tSet.higher(new Integer(85)); // >
		
//		t = tSet.pollLast();
		t = tSet.pollFirst(); //pollFirst 최솟값, 주소 하나씩 삭제 
//		System.out.println(t + ", " + tSet.size());
//		t = tSet.pollFirst();
//		System.out.println(t + ", " + tSet.size());		
		
		Iterator<Integer> dIter = tSet.descendingIterator(); //desc 내림차순 정렬
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		System.out.println("------------------------------");
		
		NavigableSet<Integer> nSet = tSet.descendingSet(); //set에 담는다
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
//		int size = tSet.size();
//		for(int i=0; i < size; i++) {
//		t = tSet.pollLast(); //pollLast 최댓값부터 주소 하나씩 삭제
//		System.out.println(t + ", " + tSet.size());
//		}
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			Integer icnt = iter.next();
//			System.out.println(icnt);
		}
	}
}
