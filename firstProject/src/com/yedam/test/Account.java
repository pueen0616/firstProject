package com.yedam.test;

public class Account {
	private static String ano;
	private static String owner;
	private static int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
