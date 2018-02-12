package com.remindme.restweb.config;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {

	@Autowired
	private EntityManagerFactory entityMgrFactory;
	
	@Bean
	public SessionFactory getSessioFactory() {
		if(entityMgrFactory.unwrap(SessionFactory.class)==null) {
			throw new NullPointerException("This is not a Hibernate session factory");
		}
		return entityMgrFactory.unwrap(SessionFactory.class);
	}
}
