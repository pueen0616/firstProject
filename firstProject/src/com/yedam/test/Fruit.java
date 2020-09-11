package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
	String FruName;
	int FruPrice;
	
	public Fruit(String fruName, int fruPrice) {
		super();
		FruName = fruName;
		FruPrice = fruPrice;
	}
	public String getFruName() {
		return FruName;
	}
	public void setFruName(String fruName) {
		FruName = fruName;
	}
	public int getFruPrice() {
		return FruPrice;
	}
	public void setFruPrice(int fruPrice) {
		FruPrice = fruPrice;
	}
	
	public List<Fruit> getFruitList() {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", 500));
		list.add(new Fruit("멜론", 200));
		list.add(new Fruit("포도", 600));
		return list;
	}
}
