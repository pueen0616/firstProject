package com.yedam.classes;

public class Calculator {
//  static : 고정적이다. 인스턴스를 바로 생성
	static double pi = 3.14;
	
	public static String Rectangle(int a, int b) {
		return "가로 " + a + " * " + "세로 " + b + " 는 " + getRectangle(a,b) ;
	}
	
	public static int getRectangle(int a, int b) {
		int result2 = 0;
		result2 = a * b;
		return result2;
	}
	
	public static int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static void getArea(double a) {	//void는 return 값 없어도된다
		
		double result =pi * a * a;
		System.out.println("반지름" + a + " 의 넓이는" + result);
	}
}
