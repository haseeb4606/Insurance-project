package com.hibernate.insert.main;

import java.util.List;

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
		AddressEntity address = new AddressEntity();

		cust.setFirstName("Sahil");
		cust.setLastName("Danish");
		cust.setDob("012/10/1995");
		cust.setEmail("danish.129@gmail.com");
		cust.setGender("Male");
		cust.setLastFourSsn("4990");
		cust.setPhone(240158697);

		cr.saveCustomer(cust);

		address.setStreet("177 YellowStone Dr");
		address.setCity("Charlottesville");
		address.setState("VA");
		address.setZipcode(22903);
		address.setType("Residentional");
		address.setCustomer(cust);

		cr.saveAddress(address);

		cust = cr.getById(1);
		if (cr != null) {
			System.out.println(cust.toString());

		}

		List<CustomerEntity> customer = cr.getAll(cust);

		for (CustomerEntity ce : customer) {

			System.out.println(ce.toString());
		}
	}

}
