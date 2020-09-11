package com.yedam.practice;


public class Course{
	String subName = "";
	int stuName = 0;
	
	
	public Course() {
		
	}
	//과정등록
	public Course(String subName, int stuName){
		this.subName = subName;
		this.stuName = stuName;
	}
	
	public String getSubName() {
		return subName;
		
	}
	
	public int getStuName() {
		return stuName;
	}
	
	public void add(Course course) {
		// TODO Auto-generated method stub
		
	}
}
