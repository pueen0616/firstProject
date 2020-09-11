package com.yedam.Hompage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yedam.database.DBConnection;
import com.yedam.database.Employee;

public class HomePageDAO {
	Connection conn = DBConnection.getConnection();
	//조회

	//로그인
	public void logHomePage(HomePageGET log) {
		String sql = "INSERT INTO home_page_ID(idd, pwd) VALUES(" + log.getId() + ", " + log.getPwd() + ")";
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력되었습니다.");
		} catch (SQLException e) {
			
		}
	}
	
	//삽입
	public void addHomePage(HomePageGET emp) {
		String sql = "INSERT INTO emp_temp(title, contents) " + "VALUES ("  + emp
				+ emp.getTitle() + ",\' "
				+ emp.getContents() + "\')";
	
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력되었습니다.");
		} catch (SQLException e) {

		}
	}
}
