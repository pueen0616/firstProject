package com.yedam.test;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0, input = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("\t" + "1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("-------------------------------------");
			System.out.print("  ����> ");
			int menu = scanner.nextInt();

			if (menu == 1) { // ����..
				System.out.print("���� �ݾ� �Է��ϼ���> ");
				input = scanner.nextInt();
				balance = balance + input;
				
			} else if (menu == 2) { // ���..
				System.out.println("��ݼ���");
				input = scanner.nextInt();
				balance = balance - input;
				System.out.println(balance);
			} else if (menu == 3) { // �ܰ�..
				System.out.println("�ܾ� : " + balance);
				
			} else if (menu == 4) // ����..
				run = false;
		}
	}
}
	