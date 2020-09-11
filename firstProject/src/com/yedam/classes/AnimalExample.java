package com.yedam.classes;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a; //자동 형변환
		a = (int) b;  //casting
		
	}

}
