package com.hibernate.homewokr.entities;

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
import javax.persistence.Table;

@Entity
@Table(name = "covered_vehicle")
public class VehicleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "make")
	private String make;
	@Column(name = "model")
	private String model;
	@Column(name = "year")
	private long year;
	@Column(name = "color")
	private String color;
	@Column(name = "vin")
	private String vinNo;
	@Column(name = "is_active")
	private boolean isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "policy_id")
	private PolicyEntity policy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVinNo() {
		return vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public PolicyEntity getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyEntity policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "VehicleEntity [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", vinNo=" + vinNo + ", isActive=" + isActive + ", policy=" + policy + "]";
	}

	
}
