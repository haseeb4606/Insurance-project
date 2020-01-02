package com.hibernate.homework.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.homewokr.entities.DriverEntity;
import com.hibernate.homewokr.entities.PolicyEntity;
import com.hibernate.homewokr.entities.VehicleEntity;

public class PolicyRepository {

	private SessionFactory sessionFactory;

	public PolicyEntity updatePlicy(PolicyEntity policy) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		PolicyEntity po = (PolicyEntity) session.merge(policy);

		session.getTransaction().commit();

		session.close();

		return po;
	}
	
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

		session.getTransaction().commit();

		session.close();

	}
	
	public DriverEntity updateDriver(DriverEntity driver) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		DriverEntity drive = (DriverEntity) session.merge(driver);

		session.getTransaction().commit();

		session.close();

		return drive;
	}

	public void addVehicle(VehicleEntity vehicle) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(vehicle);

		session.getTransaction().commit();

		session.close();

	}

	public List<VehicleEntity> getbyYear(long year) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Query q = session.createQuery("select v from VehicleEntity v where v.year =:year");
		q.setParameter("year", year);

		List<VehicleEntity> ve = q.list();
		session.getTransaction().commit();
		session.close();

		return ve;
	}

	public PolicyEntity getPolicyById(long id) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		PolicyEntity policy = (PolicyEntity) session.get(PolicyEntity.class, id);

		session.getTransaction().commit();
		session.close();

		return policy;
	}

	public DriverEntity getDriver(String firstName) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Query q = session.createQuery("select d from DriverEntity d where d.firstName =:firstName");
		q.setParameter("firstName", firstName);
		List <DriverEntity> driver = q.list();
		session.getTransaction().commit();
		session.close();

		return driver.get(0);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
