package com.mphasis.training.entity;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=10)
	private String ename;
	
	@OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id, String ename, Address address) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
	}
	public Employee() {
		
	}
	
}
