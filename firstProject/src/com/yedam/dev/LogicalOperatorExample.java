package com.yedam.dev;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // A = 65
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		
		int num1 = 10;
		int num2 = 20;
		if(num1++ >= 10 & num2++ >= 20) {
			System.out.println("참입니다.");
		}
		System.out.println(num1 + ", " + num2);
		
		int a = 30, b = 11;
		int result = a & b;
		System.out.println("논리곱결과 : " + result);
		
		result = a << 3;
		System.out.println("비트이동결과 : " + result);
		
		result += 30; // result = result+30
		boolean pass = false;
		
		pass = (result >= 80) ? true : false;
		System.out.println(pass);
		}
	}
