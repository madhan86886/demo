package com.test.hibernate.controller;

import com.test.hibernate.dao.EmployeeDao;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		//employeeDao.createEmployee();
		employeeDao.getValues();
		//employeeDao.deleteEmp(4);
		//employeeDao.update(3, "Manoj");
	}

}
