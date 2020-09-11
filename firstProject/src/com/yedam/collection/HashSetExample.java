package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();
		set.add(new Member("김다희", 30));
		set.add(new Member("김도은", 28));
		set.add(new Member("김다희", 31));

		for (Member mem : set) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
	}
}
