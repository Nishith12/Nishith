package com.mphasis.training.entity;

import java.util.Date;
import java.util.*;

import javax.persistence.*;

@Entity
public class Booking {

	@Id
	private int bid;
	private Date bdate;
	private double cost;
	@ManyToMany(mappedBy="booking", fetch = FetchType.EAGER)
	private List<Customer> customers=new ArrayList<>();
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
