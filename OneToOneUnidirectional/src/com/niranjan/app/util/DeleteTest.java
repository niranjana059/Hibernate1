package com.niranjan.app.util;

import com.niranjan.app.dao.EmployeeDAO;

public class DeleteTest {
public static void main(String[] args){
	EmployeeDAO dao=new EmployeeDAO();
	dao.deleteEmployee(1);
}
}
