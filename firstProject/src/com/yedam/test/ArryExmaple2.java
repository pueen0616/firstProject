package com.yedam.test;

public class ArryExmaple2 {
	public static void main(String[] args) {
		int[] numAry = {2, 4, 5, 3, 5};
		int result = addAry(new int[] {2, 3, 4});
		System.out.println("�迭�� �� : " + result);
	}

	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
