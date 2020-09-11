package com.yedam.generic;

import com.yedam.classes.Person;
import com.yedam.classes.Utils;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<String>(); //box에 Box클래스 <String> 제네릭 준다
		
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); // Object
//		
//		Person p1 = new Person();
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		try {
//		result = (String) box.get();	//runtime error.
//		}catch(ClassCastException e) {
//			System.out.println("에러발생!!");
//		}
	}

}
