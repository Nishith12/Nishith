package com.mphasis.training.entity;

import javax.persistence.*;

@Entity
public class Address {

	@Id
	@Column(name="id")
	private int id;
	private String street;
	
	@OneToOne
	@MapsId
	private Employee employee;

	public Address(int id, String street, Employee employee) {
		super();
		this.id = id;
		this.street = street;
		this.employee = employee;
	}
	public Address() {
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", employee=" + employee + "]";
	}
	
	
}
