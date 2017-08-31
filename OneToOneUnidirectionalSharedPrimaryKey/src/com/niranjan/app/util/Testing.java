package com.niranjan.app.util;

import java.util.Date;

import com.niranjan.app.dao.EmployeeDAO;
import com.niranjan.app.dto.AddressDTO;
import com.niranjan.app.dto.EmployeeDTO;

public class Testing {
public static void main(String[] args){
	EmployeeDTO dto=new EmployeeDTO();
	AddressDTO dto2=new AddressDTO();
	dto.setName("niranjan");
	dto.setDob(new Date());
	dto.setSalary(35000);
	dto.setPermanent(true);
	
	EmployeeDAO dao=new EmployeeDAO();
	dao.createEmployee(dto);
}
}
