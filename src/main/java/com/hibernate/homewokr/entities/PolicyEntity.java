package com.hibernate.homewokr.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "type")
	private String policyType;

	@Column(name = "policy_number")
	private String policyNo;

	@Column(name = "start_date")
	private String startDate;

	@Column(name = "expiration_date")
	private String expiration;

	@Column(name = "price")
	private String price;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	@OneToMany(mappedBy = "policy", cascade = CascadeType.ALL)
	private List<DriverEntity> driver;

	@OneToMany(mappedBy = "policy",cascade = CascadeType.ALL)
	private List<VehicleEntity> vehicle;

	public long getId() {
		return id;
	}

	
	public List<DriverEntity> getDriver() {
		return driver;
	}


	public void setDriver(List<DriverEntity> driver) {
		this.driver = driver;
	}


	public List<VehicleEntity> getVehicle() {
		return vehicle;
	}


	public void setVehicle(List<VehicleEntity> vehicle) {
		this.vehicle = vehicle;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "PolicyEntity [id=" + id + ", policyType=" + policyType + ", policyNo=" + policyNo + ", startDate="
				+ startDate + ", expiration=" + expiration + ", price=" + price + ", customer=" + customer + "]";
	}

}
