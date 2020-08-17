package com.yedam.classes;

import java.util.Scanner;

import com.yedam.test.Friend;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.정보입력(이름, 나이, 전화번호)
		// 2.리스트
		// 3.이름조회
		// 4.이름조회 후 수정
		// 9.종료
		Friend[] friend = new Friend[100];
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		//메뉴출력
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.정보입력                2.리스트               9.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scan.nextInt();
						   scan.nextLine();    // 숫자와 Enter 
			if(selectNo == 1) {
				System.out.print("이름 입력 > ");
				String name = scan.nextLine(); // 문자입력 : nextLine();
					// name 변수에 입력값을 담다
				System.out.print("나이 입력 > ");
				int age = scan.nextInt(); // 숫자입력 : nextInt();

				System.out.println("연락처 입력 > ");
				String num = scan.next(); // 문자입력 : nextLine();
				
				Friend f = new Friend(name, age, num);
				// 한건만 입력해야함.
				for(int i = 0; i < friend.length; i++) {
					if(friend[i] == null) {
						friend[i] = f;
						break; //탈출
					}
				}
			}else if(selectNo == 2) {
				for(Friend frnd : friend) {
					if(frnd != null) {
						System.out.println("이름 : " + frnd.getName()
						+ ", 나이 : " + frnd.getAge() 
						+ ", 연락처 : " + frnd.getNum());
					}
				}
			}else if(selectNo == 9) {
				
			}
		}
		System.out.println("프로그램 종료");
	}

}
