package com.yedam.test;

import java.util.Scanner;

public class ArrayExmaple09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생 수 : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // 배열 생성

			} else if (selectNo == 2) {
				System.out.println("점수 입력 : ");
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				System.out.print("점수 리스트 : ");
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				System.out.print("분석 : ");

				int MAX = 0;
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i]; // 점수 총합
				}
				avg = sum / scores.length; // 점수 평균

				for (int i : scores) {
					if (i > MAX) {
						MAX = i; // 최댓값
					}
				}
				System.out.println(sum + ", " + avg + ", " + MAX);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
