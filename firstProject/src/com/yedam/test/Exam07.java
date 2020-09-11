package com.yedam.test;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		Book books[] = new Book[100];

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.등록 | 2.삭제 | 3.전체목록  | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("등록 : ");
				System.out.print("도서번호 입력 : ");
				int bNo = scanner.nextInt();

				System.out.print("도서제목 입력 : ");
				String bName = scanner.next();

				System.out.print("도서저자 입력 : ");
				String bAuthor = scanner.next();

				Book book = new Book(bNo, bName, bAuthor);

				for (int i = 0; i < books.length; i++) {
					if (books[i] == null) {
						books[i] = book;
						break;
					}
				}
			} else if (selectNo == 2) {
				System.out.println("삭제할 도서번호 입력 : ");
				int dNo = scanner.nextInt();
				for(int i=0; i<books.length; i++) {
					if(dNo == books[i].getbNo()) {
						books[i] = null;
					}
				}

			} else if (selectNo == 3) {
				System.out.println("전체목록 : ");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						System.out.println(books[i].toString());
					}

				}
			} else if (selectNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
