package com.yedam.test;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0, input = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("\t" + "1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("  선택> ");
			int menu = scanner.nextInt();

			if (menu == 1) { // 예금..
				System.out.print("예금 금액 입력하세요> ");
				input = scanner.nextInt();
				balance = balance + input;
				
			} else if (menu == 2) { // 출금..
				System.out.println("출금선택");
				input = scanner.nextInt();
				balance = balance - input;
				System.out.println(balance);
			} else if (menu == 3) { // 잔고..
				System.out.println("잔액 : " + balance);
				
			} else if (menu == 4) // 종료..
				run = false;
		}
	}
}
	