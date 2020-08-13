package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		int[] arr;
		arr = new int[] { x, y, z };

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

//		for (int i = 0; i < 3; i++) {
//			if (aray[0] > aray[i]) {
//				int temp = aray[0];
//				aray[0] = aray[i];
//				aray[i] = temp;
//			}
//			for (int j = 0; j < 3; j++) {
//				if(aray[i]>aray[j]) {
//					int temp = aray[i];
//					aray[i] = aray[j];
//					aray[j] = aray[i];
//				}
//			}
//			System.out.println(aray[i]);
//		}
		}

	}
}
