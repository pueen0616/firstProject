package com.yedam.classes;

public abstract class Animal {
	//필드, 생성자, 메소드 가능
	private String species;
	public Animal() {
		
	}
	public void showInfo() {
		System.out.println("분류는 " + species);
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드
}
