package com.yedam.dev;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // A = 65
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("�빮���Դϴ�.");
		}
		
		int num1 = 10;
		int num2 = 20;
		if(num1++ >= 10 & num2++ >= 20) {
			System.out.println("���Դϴ�.");
		}
		System.out.println(num1 + ", " + num2);
		
		int a = 30, b = 11;
		int result = a & b;
		System.out.println("������� : " + result);
		
		result = a << 3;
		System.out.println("��Ʈ�̵���� : " + result);
		
		result += 30; // result = result+30
		boolean pass = false;
		
		pass = (result >= 80) ? true : false;
		System.out.println(pass);
		}
	}
