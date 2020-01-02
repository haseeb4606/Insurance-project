package com.hibernate.insert.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.homewokr.entities.CustomerEntity;
import com.hibernate.homewokr.entities.DriverEntity;
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
		DriverEntity dr = new DriverEntity();

		
		
		  poe.setPolicyNo("A02078B"); poe.setPolicyType("Auto");
		  poe.setStartDate("2018-06-15"); poe.setExpiration("2019-12-31");
		  poe.setPrice("$150"); poe.setCustomer(cu);
		  
		  pr.saveInfo(poe);
		  
		  
		  PolicyEntity p = pr.getById(1);
		  
		  System.out.println(p.toString());
		  
		  VehicleEntity vehicle = new VehicleEntity();
		  
		  vehicle.setActive(true); vehicle.setColor("Red"); vehicle.setMake("Toyota");
		  vehicle.setModel("Rav4"); vehicle.setVinNo("VIN253245685");
		  vehicle.setYear(2019); vehicle.setPolicy(p);
		  
		  pr.addVehicle(vehicle);
		  
		  
		  
		  dr.setActive(true); dr.setFirstName("Nabi"); dr.setLastName("Naseri");
		  dr.setLicenceNo("B60212369"); dr.setLicenceState("VA"); dr.setPolicy(p);
		  
		  pr.addDriver(dr);
		  
		  
		  List<VehicleEntity> v = pr.getbyYear(2019);
		  
		  if (v != null) {
		  
		  for (VehicleEntity ve : v) {
		  
		  System.out.println(ve.toString());
		  
		  } }
		  
		  poe = pr.getById(4);
		  
		  if (poe != null) {
		  
		  System.out.println(poe.toString()); }
		  
		  else { System.out.println("sorry no policy foud by this id"); }
		  
		  poe.setStartDate("2020-01-01"); poe.setExpiration("2020-06-30");
		 
		poe = pr.updatePlicy(poe);

		dr = pr.getDriver("Nabi");

		if (dr != null) {

			System.out.println(dr.toString());
		}

		dr.setActive(false);
		
		pr.updateDriver(dr);
	}

	
}
