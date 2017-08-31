package com.niranjan.app.util;

import java.util.Date;

import com.niranjan.app.dao.EmployeeDAO;
import com.niranjan.app.dto.AddressDTO;
import com.niranjan.app.dto.EmployeeDTO;

public class CreateTest {
public static void main(String[] args){
	EmployeeDTO dto=new EmployeeDTO();
	AddressDTO dto2=new AddressDTO();
	dto.setName("prashanth");
	dto.setDob(new Date());
	dto.setSalary(35000);
	dto.setPermanent(true);
	
	dto2.setCity("chikmagaluru");
	dto2.setState("karnataka");
	dto2.setPincode(577213);
	
	dto.setAddress(dto2);	
	EmployeeDAO dao=new EmployeeDAO();
	dao.createEmployee(dto);
}
}
