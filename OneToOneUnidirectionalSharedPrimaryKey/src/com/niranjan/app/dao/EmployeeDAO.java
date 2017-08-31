package com.niranjan.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niranjan.app.dto.AddressDTO;
import com.niranjan.app.dto.EmployeeDTO;
import com.niranjan.app.util.HibernateUtil;

public class EmployeeDAO {
	public static final SessionFactory factory=HibernateUtil.getFactory();

	public void createEmployee(EmployeeDTO dto){
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.persist(dto);
			AddressDTO dto2=new AddressDTO();
			dto2.setCity("davanagere");
			dto2.setState("karnataka");
			dto2.setPincode(577213);
			dto2.setId(dto.getId());
			dto.setAddress(dto2);	
			session.save(dto);
			tx.commit();			
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
