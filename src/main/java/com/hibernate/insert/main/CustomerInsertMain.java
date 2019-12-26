package com.hibernate.insert.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.homewokr.entities.AddressEntity;
import com.hibernate.homewokr.entities.CustomerEntity;
import com.hibernate.homework.repositories.CustomerRepository;

public class CustomerInsertMain {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("hibernate-homework.xml");

		CustomerRepository cr = (CustomerRepository) apc.getBean("customerRepository");
		
		CustomerEntity cust = new CustomerEntity();
		
		cust.setFirstName("Sahil");
		cust.setLastName("Danish");
		cust.setDob("012/10/1995");
		cust.setEmail("danish.129@gmail.com");
		cust.setGender("Male");
		cust.setLastFourSsn("4990");
		cust.setPhone(240158697);
		
		cr.saveCustomer(cust);
		

		AddressEntity address = new AddressEntity();

		/*
		 * address.setStreet("177 YellowStone Dr"); address.setCity("Charlottesville");
		 * address.setState("VA"); address.setZipcode(22903);
		 * address.setType("Residentional"); address.setCustomer(cust);
		 * 
		 * cr.saveAddress(address);
		 */

	}

}
