package com.yedam.test;

import java.util.Scanner;

public class StringCharAtExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요");
	
		for(int i=0; i<4; i++) {
			String ssn = scan.next();
			char sex = ssn.charAt(7); 
			
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자 입니다");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다");
				break;
			}
		}
	}
}
