package com.niranjan.app.util;

import com.niranjan.app.dao.EmployeeDAO;

public class UpdateTest {

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		dao.updateEmployee(80000, 111111, 1);

	}

}
