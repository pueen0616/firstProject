package com.yedam.test;

public class Example04 {
	public static void main(String[] args) {
		// 배열의 크기 3
		// 1~6까지 임의의 숫자 반복되지 않도록 배열에 저장
//		int[] intAry = new int[3];
		int[] lotto = new int[3];
		
		for(int i=0; i< lotto.length; i++) {
			int num = (int)(Math.random() *6 +1);
			lotto[i] = num;
		}
		for(int i=0; i< lotto.length; i++) {
			System.out.println();
			
			for(int j=0; j<6; j++) {
				
				System.out.print(" " + lotto[i]);
			}
		}


		
		
//		for (int i = 0; i < intAry.length; i++) {
//			intAry[i] = (int)(Math.random()+1);
//			for (int j = 0; j < 6; j++) {
//				int num = (int)(1 + Math.random() * 6);
//				if (intAry[i] != num) {
//					intAry[i] = num;
//				}
////				intAry[i] = j;
//				
//			}System.out.println(intAry[i]);
//			
//		}
		
	}
}
