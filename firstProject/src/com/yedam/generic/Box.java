package com.yedam.generic;

public class Box<Person> {		//<T>
	private Person obj;	//최상위 클래스 (모든 클래스를 자식으로 사용할 수 있다)
	
	public void set(Person obj) {
		this.obj = obj;
	}
	
	public Person get() {
	return this.obj;
	}
}
