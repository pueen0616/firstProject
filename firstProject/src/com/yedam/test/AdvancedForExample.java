package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			scores[i] = scanner.nextInt();
		}

		int sum = 0;
		double avg = 0;
		
		// 확장for
		for (int num : scores) {
			sum += num;
		}
		System.out.println("점수 총합 = " + sum);

		avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
//		Arrays.sort(scores);							//정렬해서 최댓값 찾기
//		for (int i = 0; i < scores.length; i++) {
//			
//		}System.out.println("최고 점수 = " + scores[4]);
		
		int MAX = 0;									//if문 비교 대입
		
		for(int num : scores) {
			if(num > MAX) {
				MAX = num;
			}
		}System.out.println(MAX);
	}
}
	