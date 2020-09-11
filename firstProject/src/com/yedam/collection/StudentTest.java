package com.yedam.collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		List<Student> list = new ArrayList<>();
		

		try {
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.점수입력 | 2.점수평균 | 3.최고점수 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scan.nextInt();
						   scan.nextLine();
				   
			if (selectNo == 1) {
			
				System.out.println("이름입력 > ");
				String studentName = scan.next();
				
				System.out.println("수학점수 > ");
				int mathScore = scan.nextInt();
				
				System.out.println("영어점수 > ");
				int engScore = scan.nextInt();
				
				Student stu = new Student(studentName,mathScore,engScore);
	            list.add(stu);
	            
			} else if (selectNo == 2) {
				
				
				int mathScoreAvg = 0;
				int engScoreAvg = 0;
				double a=0;
				double b=0;
				
				for(Student student : list) {
					mathScoreAvg += student.getMathScore();
					engScoreAvg += student.getEngScore();
				}
				
				a = (double)mathScoreAvg/list.size();
				b = (double)engScoreAvg/list.size();
				
				System.out.println("영어 평균 > " + a);
				System.out.println("수학 평균 > " + b);
				
			} else if (selectNo == 3) {
				int MAX = 0;
				String str = "";
				for (Student stu : list) {
					if (stu.getMathScore() > MAX) {
						MAX = stu.getMathScore(); // 최댓값
						str = stu.getStudentName();
					}	
				}			System.out.println("수학 최고 점수 : " + MAX + " 이름 : " + str);
			} else if (selectNo == 5) {
				run = false;
			}
		
		}
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력하시오.");
		}
		System.out.println("프로그램 종료");
	}
}
