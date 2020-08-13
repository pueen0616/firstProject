package com.yedam.test;

import java.util.Scanner;

public class xXxTest {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++)
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

	
		for (int i = 0; i < 10; i++) {
			if (i == 0)
				System.out.print("           ");
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
				if (x == i) {
					for (int b = 0; b <= i; b++) {
						System.out.print("*");
					}
				}
			}
			System.out.println("*");
			for (int j = 10; i < j; j--) {
				System.out.print(" ");
			}
		}
	}
}
