package com.yedam.dev;

public class BitOperatorExample {	//��Ʈ ������      ~ : ����-1
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = ~v1;
		System.out.println("v1 : " + v1 );
		System.out.println("v2 : " + (v2 + 1));
		
		byte b1 = 10;
		byte b2 = 4;
		int b3 = b1 % b2;
		
		double result = 10.0 / 4; // = 2.5   int : 2 // double Ÿ�������� �ٲ��ָ� �Ҽ��� �� ǥ��
		System.out.println(result);
	}
}
