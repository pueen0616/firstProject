package com.yedam.test;

public class ExampleAccount {

	private int balance = 0;
	final float MIN_BALANCE = 0;
	final float MAX_BALANCE = 1000000;
	
	public ExampleAccount(){
		
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
