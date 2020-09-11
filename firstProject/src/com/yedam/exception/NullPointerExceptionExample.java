package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = null;
		boolean run = true;
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) {
			System.out.println("알 수 없는 예외 발생했습니다.");
		}

		int intAry[] = new int[5];
		for (int i = 0; i <= 5; i++) {

			try {
				System.out.println("i의 값 : " + intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");
				System.out.println();
			}

		}
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자입력하세요.");

		while (run) {
			try {
				int menu = scn.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("int 범위가 아닙니다.");
				System.out.println("숫자를 입력하세요");
				scn.nextLine();
			}
		}
		System.out.println("정상 종료.");
	}
}
