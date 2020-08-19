package com.yedam.database;

import java.util.InputMismatchException;
//ctl + shift + O : 자동 import
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		
		EmpServiceImpl service = new EmpServiceImpl();
		
		while (run) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.리스트 | 2.입력 | 3.수정 | 4.삭제 | 9.종료 ");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
					
			int selectNo=0;
			
			 try{selectNo = scn.nextInt();
			 	 
			 }catch(InputMismatchException e) {
				 System.out.println("숫자를 입력하세요");
				 scn.nextLine();
				 continue;
			 }
			if (selectNo == 1) {
				System.out.println("------");
				System.out.println("리스트");
				System.out.println("------");
			
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				for (Employee emp : emps) {
					if (emp != null)
						System.out.println(emp.toString());
				}
			
			} else if (selectNo == 2) {

//				EmpDAO dao = new EmpDAO(); 
//				Employee emp = new Employee(333, "test", "test", "2020-05-05", "IT_PROG");
//				dao.addEmployee(emp);

				System.out.println("사원번호 입력 > ");
				int employee_id = scn.nextInt();

				System.out.println("이름 입력 > ");
				String first_name = scn.next();

				System.out.println("성 입력 > ");
				String last_name = scn.next();

				System.out.println("입사일 입력 > ");
				String hire_date = scn.next();

				System.out.println("부서명 입력 > ");
				String job_id = scn.next();

//				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(employee_id, first_name, last_name, hire_date, job_id);
				service.addEmp(emp);

			} else if (selectNo == 3) {
				System.out.println("수정할 사원번호를 입력하시오");
				
				System.out.println("사원번호 입력 > ");
				int employee_id = scn.nextInt();

//				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(employee_id);
				service.modEmp(emp);
				
			} else if (selectNo == 4) {
				System.out.println("삭제할 사원번호를 입력하시오");
				int delId = scn.nextInt();
								  scn.nextLine();
				
//				EmpDAO dao = new EmpDAO();
				service.delEmp(delId);
				
			}else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
