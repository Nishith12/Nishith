package com.mphasis.training.entity;

import javax.persistence.*;

@Entity
public class Product {

	@Id
	private int pid;
	private String pname;
	private double cost;
	private int qty;
	private String brand;
	
	@OneToOne
	private Person person;
	
	@ManyToOne
	private Orders order;
	public Product() {
		
	}

	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
		//this.person = person;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

//	public Person getPerson() {
//		return person;
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
}
