package com.yedam.classes;

public class Calculator {
	double pi = 3.14;
	
	public String Rectangle(int a, int b) {
		return "가로 " + a + " * " + "세로 " + b + " 는 " + getRectangle(a,b) ;
	}
	
	public int getRectangle(int a, int b) {
		int result2 = 0;
		result2 = a * b;
		return result2;
	}
	
	public int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public void getArea(double a) {	//void는 return 값 없어도된다
		double result =pi * a * a;
		System.out.println("반지름" + a + " 의 넓이는" + result);
	}
}
