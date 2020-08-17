package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal = new Cal();
//		cal.r = 5; private 땜시 못가져옴
		cal.setRadius(5);  // set : 값 설정
		System.out.println("반지름 " + cal.getRadius() + "의 넓이는 " + cal.getArea() + " 입니다");
	
//		System.out.println(10);	 //println : 각각 데이터타입 다 출력 해줌
//		System.out.println(10.5);
//		System.out.println("10");
		
		print(200);
	}
	// 메소드 오버로딩(동일한 메소드명을 사용 : 매개값의 타입이 다르거나 갯수가 다를때 사용 가능)
	public static void print(int a) {
		System.out.println("입력값은 : " + a);
	}
	
	public static void print(double a) {
		System.out.println("입력값은 : " + a);
	}
	
	public static void print(String a) {
		System.out.println("입력값은 : " + a);
	}
}
