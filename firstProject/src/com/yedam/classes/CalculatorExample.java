package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); //객체 구조 : 클래스명, 참조변수, = , new , 클래스명(인자);
		
		System.out.println("10 + 20 = " + cal.add(10, 20));
		System.out.println("10.0 + 20.0 = " + cal.add(10.0, 20.0));
		
		double r1 = 3.5;
		cal.getArea(r1);
		
		System.out.println("가로 4 * 세로 5 = 넓이 " + cal.getRectangle(4,5));
		System.out.println(cal.Rectangle(4, 5));
	}
}
