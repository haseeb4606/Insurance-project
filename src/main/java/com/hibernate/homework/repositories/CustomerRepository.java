package com.hibernate.homework.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.homewokr.entities.CustomerEntity;

public class CustomerRepository {

	private SessionFactory sessionFactory;

	public void saveCustomer(CustomerEntity customer) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(customer);

		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
