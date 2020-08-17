package com.yedam.test;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();
			

			if (selectNo == 1) {
				createAccount();

			} else if (selectNo == 2) {
				accountList();

			} else if (selectNo == 3) {
				deposit();

			} else if (selectNo == 4) {
				withdraw();

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}// main 끝
		// 계좌생성

	private static void createAccount() {
		
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌  번호 > ");
		String ano = scanner.next();

		System.out.print("계좌주 > ");
		String owner = scanner.next();

		System.out.println("초기입금액 > ");
		int balance = scanner.nextInt();

		Account A = new Account(ano, owner, balance);
		// 한건만 입력해야함.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = A;
				System.out.println("계좌가 생성되었습니다.");
				break;// 탈출
			}
		}
	}

	// 계좌목록
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) 
				break;
				System.out.println(accountArray[i].getAno() + "\t" 
			                     + accountArray[i].getOwner() + "\t" 
						         + accountArray[i].getBalance());
			}	
		}
	

	// 예금
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");

		System.out.println("계좌 번호");
		String ano = scanner.next(); 
		
		System.out.println("예금 액");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
	
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금이 성공되었습니다.");

	}

	// 출금
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");

		System.out.println("계좌 번호");
		String ano = scanner.nextLine(); 
		
		System.out.println("출금 액");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
	
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금이 성공되었습니다.");
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}

		return account;
	}
}