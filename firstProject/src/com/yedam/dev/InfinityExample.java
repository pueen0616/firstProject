package com.yedam.dev;

public class InfinityExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 2.0;
		
		double z = x % y; // NaN, Infinity
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�ǹ̾��� ���Դϴ�.");
		} else {
			System.out.println(z);
		}
	}	
}
