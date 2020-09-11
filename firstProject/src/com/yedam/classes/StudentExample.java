package com.yedam.classes;

import javax.net.ssl.SSLContext;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Student a1 = new Student();
		a1.studentName = "홍길동";
		a1.studentDep = "모바일";
		a1.studentNum = 111;
		
		a1.setStudentName("길동");
		a1.setStudentDep("모바일");
		System.out.println("이름은 " + a1.getStudentName()
						+ " 학과는 " + a1.getStudentDep()
						+ " 학번은 " + a1.getStudentNum());
		
		Student[] s= {a1};
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].student());
		}
		//////////////////////////////////////////////////////////
		
		Student s1 = new Student(564, "김현동", "모바일");
		Student s2 = new Student(123, "최재영", "컨텐츠");
		Student s3 = new Student(789, "최창훈", "화이링");
		
		Student[] sAry= {s1, s2, s3};
		for(int i=0; i<sAry.length; i++) {
		
			System.out.println(sAry[i].student());
		}
		
		String name = "현동";
		int age = 27;
		String num = "010-4524-1972"; 
	}
}
