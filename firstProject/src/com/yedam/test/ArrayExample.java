package com.yedam.test;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		int sum = score1 + score2 + score3 + score4;

		int[] intAry = { 10, 20, 30, 40 };
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50;
		System.out.println(intAry.length);

		sum = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum : " + sum);
		
		double[] dAry = { 2.3, 4.3};
		
		String[] sAry = { "hello", "world", "nice", "good" };
		for (int i=0; i<sAry.length; i++) {
			System.out.println(sAry[i]);
		}
		
		String[] scoreAry = new String[5];
		for(int i=0; i<scoreAry.length; i++) {
			System.out.println(scoreAry[i]);	
		}
		scoreAry[0] = "One";
		scoreAry[1] = "Two";
		scoreAry[2] = "Three";
		for(int i=0; i<scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		
		int[] mathAry;
		mathAry = new int[] {1, 2, 3, 4};
	}
}
