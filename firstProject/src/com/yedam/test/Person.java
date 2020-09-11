package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	int age;
	

	
	public Person(String name, int age) {
		super();
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
	
	public List<Person> getPersonList() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("최재영", 20));
		list.add(new Person("민해주", 21));
		list.add(new Person("김상민", 22));
		return list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
