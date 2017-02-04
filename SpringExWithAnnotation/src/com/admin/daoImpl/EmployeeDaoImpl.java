package com.admin.daoImpl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.admin.config.HibernateConfiguration;
import com.admin.dao.EmployeeDao;
import com.admin.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		Session session = HibernateConfiguration.getSessionFactory();
		
		try{
			session.save(employee);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

}
