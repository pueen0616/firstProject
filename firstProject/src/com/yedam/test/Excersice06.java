package com.yedam.test;

import java.util.Scanner;

public class Excersice06 {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//			for (int a = 0; a <= i; a++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		for (int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

