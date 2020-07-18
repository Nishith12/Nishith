package com.mphasis.training.entity;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	private long phnum;
	private String email;
	@OneToMany
	private List<Booking> booking=new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="mid")
	private Movie movie=new Movie();
	@ManyToOne
	@JoinColumn(name="tid")
	private Theater theater=new Theater();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
