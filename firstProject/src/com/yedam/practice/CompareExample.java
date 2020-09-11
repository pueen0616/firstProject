package com.yedam.practice;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student a, Student b) {
			// TODO Auto-generated method stub
			/*if(a.sno < b.sno) return -1;
			else if(a.sno == b.sno) return 0;
			else*/ return Integer.compare(a.sno, b.sno);
		}
	}
	
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s3, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
	}
}
