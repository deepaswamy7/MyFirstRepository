package com.app.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.app.configuration.HibernateConfiguration;
import com.app.dao.CustomerDao;
import com.app.model.CustomerDetails;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save(CustomerDetails customer) {
	Session session=HibernateConfiguration.getSessionFactory();
	
	try{
		session.save(customer);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		session.close();
	}
	
}
}
