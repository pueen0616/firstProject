package com.yedam.dev;

public class OperaterExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = -3 + (-8 - -5) * -4 + val1++;
	
		System.out.println(result);
		
		//������ ���
		result = 10 % 7;
		System.out.println("������ : " + result);
		
		//������ ���
		result = 10 / 7; //������ ���
		System.out.println("������ : " + result);
		
		double r1 = 10 / 7;
		System.out.println("������2 : " + r1);
		
		double r2 = 10 / 7.0; // �Ǽ� = ���� / �Ǽ�
		System.out.println("������2 : " + r2);
		
		for (int i = 1; i <= 10; i++){
//			System.out.println(i);
			if(i%2 == 1) {
				System.out.println(i + " Ȧ���Դϴ�");
			}else {
				System.out.println(i + " ¦���Դϴ�");
			}
		}
	}
}
