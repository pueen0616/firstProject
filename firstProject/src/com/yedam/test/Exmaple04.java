package com.yedam.test;

public class Exmaple04 {
	public static void main(String[] args) {
		int pencils = 543;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}
