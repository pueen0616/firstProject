package com.yedam.dev;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if(v1 == v2){
			System.out.println("�⺻Ÿ�� �� ���");
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if (str1 == str2) {
			System.out.println("str1, str2�� ���� �����Դϴ�.");
		}
		
		if (str1 == str3) {
			System.out.println("str1, str3�� ���� �����Դϴ�.");
		}
		System.out.println((1 == 1) || (2 == 3));
		System.out.println((1 == 1) & (2 == 3));
	}
}
