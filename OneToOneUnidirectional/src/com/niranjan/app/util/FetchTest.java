package com.niranjan.app.util;

import com.niranjan.app.dao.EmployeeDAO;

public class FetchTest {

	public static void main(String[] args) {
	EmployeeDAO dao=new EmployeeDAO();
	System.out.println(dao.fetchEmployeeById(1));
	}

}
