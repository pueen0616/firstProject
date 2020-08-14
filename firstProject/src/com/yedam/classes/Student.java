package com.yedam.classes;

public class Student {
	 String studentName;
	 String studentDep;
	 int studentNum;

	public Student() {
		
	}
	
	public String student() {
		return "이름은 (" + studentName + ") 학번은 (" + studentNum + ") 학과는 (" + studentDep + ")";
	}
	
	//생성자
	public Student(int studentNum, String studentName, String studentDep) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentDep = studentDep;
	}

	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentDep(String studentDep) {
		this.studentDep = studentDep;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentDep() {
		return studentDep;
	}

	public int getStudentNum() {
		return studentNum;
	}
	
	@Override
	public String toString() {
		return " [studNo = " + studentName + ", " + studentNum + ", " + studentDep + "]" ;
	}

}
