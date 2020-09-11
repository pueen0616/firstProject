package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet; //먼가 정렬되어 있는 Set 같다.
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); // 12보다 작은값들을 Set에 담아라, 14는 못담는다
		sSet = set.tailSet(new Person("So", 12));
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 13)); //앞의 값은 포함(10), 뒤의 값은 제외(13)
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}

		System.out.println();

		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true); // 12도 포함 시키겠다.
		nSet = set.tailSet(new Person("Sorted", 12), false);
		set.subSet(new Person("SSS", 10), true, new Person("TTT", 12), true);
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}

		System.out.println();
		
		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) { // .hasNext() : 현재 위치에서 다음 데이터를 가져오겠다.
			System.out.println(iter.next().name + ", " + iter.next().age); // .next() 다음 데이터를 가져오겠다.
		}
	}
}
