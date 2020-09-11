package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, String> tMap = new TreeMap<>(); //TreeMap : 
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
		//Compare To 비교 오버라이딩 해줘야함 
		//Student 클래스 implements 
		SortedMap<Student, String> sMap = tMap.headMap(new Student("hi", 80, 88)); //headMap :이전 값을 가져온다
		Set<Student> set = sMap.keySet(); //ketSet : 다가져옴
		for(Student s : set) {
			System.out.println(s.getStudentName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		
		System.out.println();
		
		SortedMap<Student, String> sMap2 = tMap.subMap(new Student("hi", 70, 78), new Student("HI", 80, 88)); //submap : 2개 매개를 비교 between
		Set<Student> set2 = sMap2.keySet();
		for(Student s : set2) {
			System.out.println(s.getStudentName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		
//		tMap.tailMap(fromKey) //80점 이상...	
//		tMap.subMap(fromKey, toKey) //70에서 80사이
	}

}
