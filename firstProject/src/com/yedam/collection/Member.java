package com.yedam.collection;
//com.yedam.collection.Member : 다른 패키지면 클래스명 같아도 ㄱㅊ
public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
//		return super.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
	
}
