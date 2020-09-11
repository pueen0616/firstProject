package com.yedam.interfaces;

public class DaoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataAccessObject dao = new MysqlDb();

		dao.select();
		dao.insert();
		dao.update();
	}

}
