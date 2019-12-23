package com.hibernate.insert.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.homewokr.entities.CustomerEntity;
import com.hibernate.homewokr.entities.PolicyEntity;
import com.hibernate.homewokr.entities.VehicleEntity;
import com.hibernate.homework.repositories.CustomerRepository;
import com.hibernate.homework.repositories.PolicyRepository;

public class PolicyInsertMain {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("hibernate-homework.xml");
		
		PolicyRepository pr = (PolicyRepository) apc.getBean("policyRepository");
		CustomerRepository cust = (CustomerRepository) apc.getBean("customerRepository");
		CustomerEntity cu = cust.getById(1);
		PolicyEntity poe = new PolicyEntity();
		
		/*
		 * poe.setPolicyNo("A02078B"); poe.setPolicyType("Auto");
		 * poe.setStartDate("2018-06-15"); poe.setExpiration("2019-12-31");
		 * poe.setPrice("$150"); poe.setCustomer(cu);
		 * 
		 * pr.saveInfo(poe);
		 */
		
		PolicyEntity p = pr.getById(1);
		
		System.out.println(p.toString());
		
		VehicleEntity vehicle = new VehicleEntity();
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
