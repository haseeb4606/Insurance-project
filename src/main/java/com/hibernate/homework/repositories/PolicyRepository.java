package com.hibernate.homework.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.homewokr.entities.DriverEntity;
import com.hibernate.homewokr.entities.PolicyEntity;

public class PolicyRepository {

	private SessionFactory sessionFactory;

	public void saveInfo(PolicyEntity policy) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(policy);

		session.getTransaction().commit();

		session.close();

	}
	
	public PolicyEntity getById(long id) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		PolicyEntity p = (PolicyEntity) session.get(PolicyEntity.class, id);
		
		session.getTransaction().commit();
		
		session.close();
		
		return p;
		
	}
	
	public void addDriver(DriverEntity driver) {
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(driver);
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
