package com.yedam.test;

public class ArrayExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] iAry = { { 10, 20 }, { 30, 40, 50 }, { 60, 30 }, { 40 } };

		for (int j = 0; j < iAry.length; j++) {
			for (int i = 0; i < iAry[j].length; i++) {
				System.out.print(iAry[j][i] + " ");
			}
			System.out.println();
		}
	}
}
