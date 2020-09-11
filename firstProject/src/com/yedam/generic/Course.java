package com.yedam.generic;

public class Course<T> {
	private String coursename;
	private T[] students;	//배열 타입

	public Course(String courseName, int capacity) {
		this.coursename = courseName;
		this.students = (T[]) new Object[capacity]; //배열 선언 시 형변환이 필요하다.(Object로 모든 타입을 받을 수 있게)
	}

	public String getCoursename() {
		return coursename;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
}
