package com.yedam.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {

//		Calendar cal = Calendar.getInstance(); // 키보드로 년도와 월을 입력받기 위한 객체 생성 
//	    Scanner sc = new Scanner(System.in);  // 년도와 월을 입력받음 
//	    System.out.println("년도를 입력하세요 : "); 
//	    int year = sc.nextInt(); 
//	    System.out.println("월을 입력하세요 : "); 
//	    int month = sc.nextInt();  // 년도와 월을 기준으로 날짜 객체를 변경(월은 실제 입력받은 월보다 +1) 
//	    cal.set(Calendar.YEAR, year); 
//	    cal.set(Calendar.MONTH, month); 
//	    System.out.println("---------["+year+"년 "+month+"월]---------"); 
//	    System.out.println(" 일 월 화 수 목 금 토");  // 입력받은 년도와 날짜로 날짜 객체 변경 날은 매월 첫날인 1일로 설정 
//	    
//	    cal.set(year,month-1,1);  // 해당월을 마지막 날 가져옴.    
//	    int end = cal.getActualMaximum(Calendar.DATE);  // 요일을 가져옴. 
//	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  // 해당월에 날짜 수만큼 반복 함. 
//	    for(int i=1; i<=end; i++) {  // 매월 첫번째 날 
//	      if(i==1) {  // 해당요일까지 오기까지 공백 문자 출력 
//	        for(int j=1; j<dayOfWeek; j++) { 
//	          System.out.print("    "); 
//	       } 
//	    }  // 날짜 형식 1자리인지 2자리인 판단하게 공백문자를 삽입 
//	    if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기 
//	      System.out.print(" "); 
//	   } 
//	   // 날짜 출력 
//	   System.out.print(" "+i+" "); 
//	   // 요일이 7로 나눠 떨어지면 개행 
//	   if(dayOfWeek%7==0) { //한줄에 7일씩 출력 
//	     System.out.println(); 
//	  } 
//	  // 요일은 하나씩 증가 함. 
//	  dayOfWeek++; 
//	} 

		// TODO Auto-generated method stub
//		Calendar cal = Calendar.getInstance(); // 2020-08-19
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH) + 1); // 월 : 0 ~ 11
//		System.out.println(cal.get(Calendar.DATE));
//
//		cal.set(2020, 2, 1);
//		System.out.println();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 월 : 0 ~ 11
//		System.out.println(cal.get(Calendar.DATE));

		createCalendar();
		createCalendar1();
//		createCalendar2(2020, 8);
		createCalendar3();
	}

	public static void createCalendar() {
		System.out.print("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" + "목" + "\t" + "금" + "\t" + "토");
		System.out.println();
		for (int i = 1; i <= 30; i++) {
			if (i % 7 != 0)
				System.out.print("\t" + i);
			if (i % 7 == 0) {

				System.out.print("\t" + "\n" + i);
			}
		}
		System.out.println();
		System.out.println();
	}

	public static void createCalendar1() {
		System.out.print("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" + "목" + "\t" + "금" + "\t" + "토");
		System.out.println();
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				System.out.println();

			}
		}
		System.out.println();
		System.out.println();
	}

//	public static void createCalendar2(int year, int month) {
//		Calendar cal = Calendar.getInstance();
//
//		System.out.println("\t" + "\t" + "\t" + cal.get(Calendar.YEAR) + " . " + (cal.get(Calendar.MONTH) + 1));
//		System.out.println();
//		System.out.println("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" + "목" + "\t" + "금" + "\t" + "토");
//
//		cal.set(year, month, 1);
//
//	}

	public static void createCalendar3() {
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		System.out.println("--------[" + year + "년 " + month + "월]---------");
		System.out.println("일" + "     " + "월" + "      " + "화" + "      " + "수" + "      " + "목" + "      " + "금" + "     " + "토");

		cal.set(year, month - 1, 1); // 마지막날
		
		int max = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i <= max; i++) {
			
			if (i == 1) {
				
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) {
				System.out.print(" ");
			}

			System.out.print(" " + i + " ");

			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}

			dayOfWeek++;
		}
	}
}