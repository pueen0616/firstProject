package com.yedam.cond;

public class SwitchExmaple {
	public static void main(String[] args) {
		int m = (int) (Math.random() * 6) + 1; // 0 < m < 10 ���� ��
		
		System.out.println(m);

		switch (m) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}
}
