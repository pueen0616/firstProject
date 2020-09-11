package com.yedam.practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String stuName = "";
	private int age = 0;
	private String stuGrade ="";
	
	public Student() {
		
	}
	
	public Student(String stuName, int age, String stuGrade) {
		super();
		this.stuName = stuName;
		this.age = age;
		this.stuGrade = stuGrade;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStuGrade() {
		return stuGrade;
	}

	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}

	public List<Student> getJavaList() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("김현동", 25, "A"));
		list.add(new Student("최재영", 22, "B"));
		list.add(new Student("김시무", 27, "I"));
		list.add(new Student("민해주", 28, "F"));
		return list;
	}
	
	public List<Student> getOracleList() {
		// TODO Auto-generated method stub
		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("민해주", 28, "F"));
		list2.add(new Student("허성준", 27, "Z"));
		list2.add(new Student("김다희", 27, "A"));
		list2.add(new Student("이괗오", 27, "B"));
		list2.add(new Student("임성은", 27, "A"));
		return list2;
	}

}
