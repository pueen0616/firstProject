package com.yedam.practice;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 boxing
		Integer obj = 100;
		System.out.println("Value : " + obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("Value : " + value);
		
		//연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result" + result);
	}

}
