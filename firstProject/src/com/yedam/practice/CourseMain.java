package com.yedam.practice;

import java.util.List;

public class CourseMain {
	String sub;
	int stuNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Course cor = new Course("Oracle", 5);
	System.out.println(cor.getSubName());
	Student java = new Student();
	
	List<Student> list = java.getJavaList();
	for(Student student : list) {
		System.out.println("이름 : " + student.getStuName() + ", 나이 : " + student.getAge() + ", 등급 : " + student.getStuGrade());
	}
	
	System.out.println();

	Course cor2 = new Course("Java", 10);
	System.out.println(cor2.getSubName());
	Student oracle = new Student();
	List<Student> list2 = oracle.getOracleList();
	for(Student student : list2) {
		System.out.println("이름 : " + student.getStuName() + ", 나이 : " + student.getAge() + ", 등급 : " + student.getStuGrade());
	}
	
	}

}
