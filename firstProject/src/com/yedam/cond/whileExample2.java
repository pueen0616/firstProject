package com.yedam.cond;

import java.io.IOException;

public class whileExample2 {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int num = 10;
		int keyCode = 10;
		
		System.out.println("Ű�� ��������.");
		while(run) {
			keyCode = System.in.read();
			if(keyCode != 13 && keyCode != 10)
			System.out.println(keyCode);
			if (keyCode == 57)
				run = false;
//			System.out.println("num: " + num);
//			if(num-- == 0)
//				run = false;
		}
		System.out.println("���α׷� ����.");
	}
}
