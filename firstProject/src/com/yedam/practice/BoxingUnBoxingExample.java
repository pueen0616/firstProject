package com.yedam.practice;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		
		//Unboxing
		int value01 = obj1.intValue();
		int value02 = obj2.intValue();
		int value03 = obj3.intValue();
		
		System.out.println(value01);
		System.out.println(value02);
		System.out.println(value03);
		
	}

}
