package com.yedam.cond;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] {3, 6, 9, 2, 4};
		
		int[] cpyAry = new int[5];
		
		System.arraycopy(origAry, 0, cpyAry, 0, 5);
		
		for(int i=0; i<origAry.length; i++) {
			System.out.println(cpyAry[i]);
		}
		
		// È®Àå for()
		for(int num : cpyAry) {
			System.out.println(num);
		}
	}
}
