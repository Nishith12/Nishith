package com.mphasis.training.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Theater {

	@Id
	private int tid;
	private int noofseats;
	@OneToMany
	private List<Booking> bookings=new ArrayList<>();
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	
}
