package com.yedam.test;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //32 : 공백문자
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6, 4 : 74번부터 4개 (74, 97, 118, 97)
		System.out.println(str2);
		}
}
