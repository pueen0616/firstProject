package com.yedam.test;

public class ExampleAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleAccount account = new ExampleAccount();
		
		account.setBalance(10000);
		System.out.println("현재 잔고" + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고" + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고" + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고" + account.getBalance());
	}

}
