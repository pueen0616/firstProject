package com.yedam.ref;

public class Student {
	
	private String sName;
	private int age;
	private int score; // 성적
	
	
	public Student(String sName, int age, int score) {
		super();
		this.sName = sName;
		this.age = age;
		this.score = score;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [sName=" + sName + ", age=" + age + ", score=" + score + "]";
	}

	
	
}
