package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

//	public static void getInfo(Map<String, String> m) {
//		
//		System.out.println("이름 : " + m.get("이름"));
//		System.out.println("전공 : " + m.get("전공"));
//			
//	}

	public static void getAge(Map<String, Integer> m1) {
		Set<Map.Entry<String, Integer>> entSet2 = m1.entrySet();
		for (Map.Entry<String, Integer> m : entSet2) {
			System.out.println(m.getKey() + ", " + m.getValue());
		}
	}
	
	public static void getKey(Map<String, Integer> m1) {
		Set<Entry<String, Integer>> str = m1.entrySet();
		for(Entry<String, Integer> m : str) {
			System.out.println(m.getKey());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("이름", "김현동");
//		map.put("전공", "스마트");
//		getInfo(map);		//클래스명 getInf의  map 출력

		Map<String, Integer> m2 = new HashMap<>();
		m2.put("최재영", 20);
		m2.put("김현동", 23);
		m2.put("허성준", 26);
		getAge(m2);
		getKey(m2);
//		Map<Integer, Member> map1 = new HashMap<>();
//		map1.put(11, new Member("김현동", 20));
//		map1.put(12, new Member("박진규", 21));
//		map1.put(13, new Member("최재영", 22));
//
//		System.out.println(map1.get(11).getName() + map1.get(11).getAge());
//
//		
//	Set<Integer> set1 = map1.keySet();
//		for (Integer i : set1) {
//			Member m = map1.get(i);
//			System.out.println(m.getName() + ", " + m.getAge());
//		}
//
//		
//		Set<Map.Entry<Integer, Member>> entSet2 = map1.entrySet();
//		for (Map.Entry<Integer, Member> m : entSet2) {
//			System.out.println(m.getKey() + ", " + m.getValue().getName());
//		}
	}
}
