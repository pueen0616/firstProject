package com.yedam.classes;

public class Parent {
	private String name;
	private int age;
	
	public Parent() {
		
	}
	
	public Parent(String name, int age) {
		super();	//부모클래스
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
//		return super.toString(); //부모 클래스를 가진 새로운 클래스 반환
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	
}
