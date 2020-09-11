package com.yedam.practice;

public class NewExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nvl(null, "초기값");
		nvl("입력값", "초기값");
	}
	
	public static void nvl(String str1, String defaultValue) {
//		if(str1 == null) {
//			System.out.println(defaultValue);
//		} else {
//			System.out.println(str1);
//		}
		
		System.out.println((str1 == null) ? defaultValue : str1);
		
	}
}
