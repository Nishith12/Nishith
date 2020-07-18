package com.mphasis.training.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderid;

	private Date orderedDate;
	private double totalCost;
	@OneToOne
	@JoinColumn(name="cust_id")
	private Person person=new Person();
	@ManyToMany
	private Set<Product> products=new HashSet<>();
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}


	

	public Orders(int orderid, Person person) {
		super();
		this.orderid = orderid;
		this.person = person;
	}
	public Orders() {
		
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
