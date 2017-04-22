package com.example.config;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.example.model.Orders;

public class HibernateConfiguration {
	private static SessionFactory sessionFactory;
	
	static{
		try{
			Configuration config = new Configuration();
			config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/newapp");
			config.setProperty("hibernate.connection.username", "root");
			config.setProperty("hibernate.connection.password", "deepu");
			config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
			config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			config.setProperty("hibernate.show_sql", "false");
			config.setProperty("hibernate.connection.autocommit", "true");
			config.setProperty("hibernate.id.new_generator_mappings", "false");
			
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
			sessionFactory = config.addPackage("com.example.model.*").addAnnotatedClass(Orders.class).buildSessionFactory(builder.build());
		
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static Session getSessionFactory() throws HibernateException{
		return sessionFactory.openSession();
		
	}
}

