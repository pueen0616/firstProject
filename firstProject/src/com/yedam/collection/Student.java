package com.yedam.collection;

public class Student implements Comparable<Student>{
	private String studentName;
	private int mathScore = 0;
	private int engScore = 0;
	
	public Student(String studentName, int mathScore, int engScore) {
		super();
		this.studentName = studentName;
		this.mathScore = mathScore;
		this.engScore = engScore;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if((this.mathScore + this.engScore) < (o.mathScore + o.engScore))
			return -1;
		else
			return 1;
	}
}
