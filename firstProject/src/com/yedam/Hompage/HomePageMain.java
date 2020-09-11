package com.yedam.Hompage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
//ctl + shift + O : 자동 import
import java.util.Scanner;

import com.yedam.collection.Student;
import com.yedam.database.EmpServiceImpl;
import com.yedam.database.Employee;

public class HomePageMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		HomePageServiceImpl service = new HomePageServiceImpl();
		
		while (run) {

			System.out.println("----------------------------------------------");
			System.out.println("1.게시글작성 | 2.게시글수정 | 3.게시글삭제 | 4.전체글보기 | 5.계정추가");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = 0;
			selectNo = scn.nextInt();
			

			if(selectNo == 5) {
				System.out.println("ID를 입력 > ");
				String id = scn.next();
				System.out.println("비밀번호 입력 > ");
				String pwd = scn.next();
				
//				HomePageDAO dao = new HomePageDAO();
				HomePageGET login = new HomePageGET(id, pwd);
				service.addHomePage(login);
			}
			
			if (selectNo == 1) {
				System.out.println("제목 입력 > ");
				String title = scn.next();

				System.out.println("내용 입력 > ");
				String contents = scn.next();

//				HomePageDAO dao = new HomePageDAO();
				HomePageGET hpg = new HomePageGET(title, contents);
				service.addHomePage(hpg);

			} else if (selectNo == 2) {

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {
			
			}
		
			System.out.println("프로그램 종료");
		}
	}
}
