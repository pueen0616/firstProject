package com.yedam.database;

public class EmpServiceImpl implements EmpService{

	EmpDAO dao = new EmpDAO();
	
	@Override
	public Employee[] shoiwList() {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		dao.addEmployee(emp);
	}

	@Override
	public void modEmp(Employee emp) {
		// TODO Auto-generated method stub
		dao.modifyEmployee(emp);
	}


	@Override
	public void delEmp(int employee_id) {
		// TODO Auto-generated method stub
		dao.deleteEmployee(employee_id);
	}

}
