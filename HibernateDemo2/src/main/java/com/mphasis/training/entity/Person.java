package com.mphasis.training.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;
	private long ph_no;
	private String email;
	private String address;
	@OneToMany(mappedBy="person" , fetch=FetchType.EAGER)
	private List<Orders> orders=new ArrayList<>();
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//	@OneToOne(mappedBy="person")
//	private Product product;

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
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
}
