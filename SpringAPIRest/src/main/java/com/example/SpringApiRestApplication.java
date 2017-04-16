package com.example;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

		@SpringBootApplication
		@Configuration
		public class SpringApiRestApplication {

			public static void main(String[] args) {
				SpringApplication.run(SpringApiRestApplication.class, args);
			}
			
			@Autowired
			private EntityManagerFactory entityManagerFactory;

			@Bean
			public SessionFactory getSessionFactory() {
			    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
			        throw new NullPointerException("factory is not a hibernate factory");
			    }
			    return entityManagerFactory.unwrap(SessionFactory.class);
			}
		}
		
