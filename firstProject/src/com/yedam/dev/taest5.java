package com.yedam.dev;

public class taest5 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "HyeonDong";
		System.out.println(str1 + ", " + name + str2);

		int v1 = 150, v2 = 270, v3 = 320;
		int result = add(v1, v2, v3);
		System.out.println("�����: " + result);

		introduce("KINGDONG");

		int x1 = 9999, x2 = 5564, x3 = 1234;
		int result1 = minus(x1, x2, x3);
		System.out.println("�����: " + result1);
	}

	public static int minus(int x, int y, int z) { // method ȣ�� return ��ȯ �ʿ�
		int minus = x - y - z;
		return minus;
	}

	public static void introduce(String name) {
		System.out.println("�ȳ��ϼ���. ���� " + name + " �Դϴ�.");
	}

	public static int add(int x, int y, int z) { // method ȣ�� return ��ȯ �ʿ�
		int sum = x + y + z;
		return sum;
	}
}
