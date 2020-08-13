package com.yedam.dev;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2147483647 , -2147483648
		int reuslt = safeAdd(2147483647, -10);
		System.out.println(reuslt);
	}

	public static int safeAdd(int a, int b) {
		int sum = 0;

		if (b > 0) {
			if ((Integer.MAX_VALUE - b) <= a) {
				System.out.println("유효값이 아닙니다.");
				sum = 0;
			} else {
				sum = a + b;
			}
		} else {
			if (Integer.MIN_VALUE - b < a) {
				System.out.println("유효값이 아닙니다.");
				sum = 0;
			} else {
				sum = a + b;
			}
		}
		return sum;
	}

}