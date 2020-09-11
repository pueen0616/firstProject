package com.yedam.Hompage;

import com.yedam.database.EmpDAO;
import com.yedam.database.EmpService;
import com.yedam.database.Employee;

public class HomePageServiceImpl implements HomePageService {
	HomePageDAO dao = new HomePageDAO();

//	@Override
//	public HomePageGET[] shoiwList() {
//		// TODO Auto-generated method stub
//		return dao.getEmpList();
//	}

	@Override
	public void addHomePage(HomePageGET emp) {
		dao.addHomePage(emp);
		// TODO Auto-generated method stub

	}
	
	@Override
	public void addHomePageLog(HomePageGET emp) {
		dao.logHomePage(emp);
	}

//	@Override
//	public void modEmp(Employee emp) {
//		// TODO Auto-generated method stub
//		dao.modifyEmployee(emp);
//	}
//
//	@Override
//	public void delEmp(int employee_id) {
//		// TODO Auto-generated method stub
//		dao.deleteEmployee(employee_id);
//	}
}
