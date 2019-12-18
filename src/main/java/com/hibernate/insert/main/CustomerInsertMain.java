package com.hibernate.insert.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.homewokr.entities.CustomerEntity;
import com.hibernate.homework.repositories.CustomerRepository;

public class CustomerInsertMain {

	public static void main(String[] args) {

		
		ApplicationContext apc = new ClassPathXmlApplicationContext("hibernate-homework.xml");
		
		CustomerRepository cr = (CustomerRepository) apc.getBean("customerRepository");
		
		CustomerEntity  cust = new CustomerEntity();
		
		cust.setFirstName("Hasib");
		cust.setLastName("Haidary");
		cust.setEmail("haseeb.4606@gmail.com");
		cust.setPhone(434252);
		cust.setGender("Male");
		cust.setLastFourSsn("4858");
		cust.setDob("01/8/1994");
		
		cr.saveCustomer(cust);
		
		
	}

}
