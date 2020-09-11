package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.price - o2.price;
	}

}

public class TreeMapExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp());
		map.put(new Fruit("Orange", 1000), 1);
		map.put(new Fruit("Grape", 3000), 2);
		map.put(new Fruit("Banana", 2000), 3);
		Set<Fruit> set = map.keySet();
		NavigableSet<Fruit> dSet = map.descendingKeySet(); //NavigableSet : 정렬 되어있는 Set, desc : 역순으로
		dSet = map.navigableKeySet();
		Iterator<Fruit> iter = dSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
