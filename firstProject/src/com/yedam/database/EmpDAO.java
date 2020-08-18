package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {

	//수정
	public void modifyEmployee(Employee emp) {
	Connection conn = DBConnection.getConnection();
	
	String sql = "UPDATE emp_temp SET salary = salary + 10 WHERE employee_id = 101; " 
			+ emp;
	
	System.out.println(sql);
	try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		int r = psmt.executeUpdate();
		System.out.println(r + " 행이 수정 되었습니다.");
	} catch (SQLException e) {

	}
	
	}
	//삭제
	public void deleteEmployee(int employee_id) {
		Connection conn = DBConnection.getConnection();
		
		String sql = "DELETE INTO emp_temp(employee_id) " 
				+ employee_id;
		
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 행이 삭제 되었습니다.");
		} catch (SQLException e) {

		}
	}

	// 입력
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
//		insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//		values (301, 'test', 'test', '2020-05-05', 'IT_PROG');
		String sql = "INSERT INTO emp_temp(employee_id, last_name, email, hire_date, job_id) " + "VALUES ("
				+ emp.getEmployeeId() + ",\' " 
				+ emp.getLastName() + "\',\' " 
				+ emp.getEmail() + "\',\' " 
				+ emp.getHireDate() + "\',\' " 
				+ emp.getJobId() + "\')";
		
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력되었습니다.");
		} catch (SQLException e) {

		}
	}

	// getEmpList 메소드
	public Employee[] getEmpList() {

		Employee[] employees = new Employee[100];
		Connection conn = DBConnection.getConnection();

		try {
			// 배열 선언
			String sql = "select * from emp_temp";// 쿼리 작성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // ResultSet에 결과값을 넣고

			int idx = 0;
			while (rs.next()) { // ResultSet 가져올꼐 있으면 참
				Employee emp = new Employee();
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getString("hire_date"));

				employees[idx++] = emp;
			}
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
