package com.yedam.test;

import java.util.Scanner;

public class ArrayExmaple09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л� �� : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // �迭 ����

			} else if (selectNo == 2) {
				System.out.print("���� �Է� : ");
				studentNum = scanner.nextInt();
				for (int i = 1; i < scores.length; i++) {
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				System.out.print("���� ����Ʈ : ");
				System.out.println(scores);

			} else if (selectNo == 4) {
				System.out.print("�м� : ");

				int MAX = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += sum + scores[i];
				}
				avg = sum / scores.length;
				System.out.println(sum + " ," + avg + "" + MAX);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}
}
