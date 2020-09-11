package com.yedam.database;

public interface EmpService {
	public Employee[] shoiwList();
	public void addEmp(Employee emp);
	public void modEmp(Employee emp);
	public void delEmp(int employee_id);
}
