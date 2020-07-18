package com.mphasis.training.entity;

import javax.persistence.Entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Location {
	
	@Id
	private String lcode;
	@Column(length=10,unique=true)
	private String lname;
	
	@OneToMany(mappedBy="loc",fetch = FetchType.EAGER)
	private List<Department> deps=new ArrayList<>();
	@Transient
	private int pincode;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Location(String lcode, String lname) {
		super();
		this.lcode = lcode;
		this.lname = lname;
	}
	public Location() {
		
	}
	public List<Department> getDeps() {
		return deps;
	}
	public void setDeps(List<Department> deps) {
		this.deps = deps;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Location [lcode=" + lcode + ", lname=" + lname + "]";
	}
	

}
