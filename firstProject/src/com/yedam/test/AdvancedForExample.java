package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = scanner.nextInt();
		}

		int sum = 0;
		double avg = 0;
		
		// Ȯ��for
		for (int num : scores) {
			sum += num;
		}
		System.out.println("���� ���� = " + sum);

		avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
		
//		Arrays.sort(scores);							//�����ؼ� �ִ� ã��
//		for (int i = 0; i < scores.length; i++) {
//			
//		}System.out.println("�ְ� ���� = " + scores[4]);
		
		int MAX = 0;									//if�� �� ����
		
		for(int num : scores) {
			if(num > MAX) {
				MAX = num;
			}
		}System.out.println(MAX);
	}
}
	