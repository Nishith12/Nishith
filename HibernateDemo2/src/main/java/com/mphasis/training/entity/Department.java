package com.mphasis.training.entity;

import javax.persistence.*;

@Entity
public class Department {
	
	@Id
	private int deptcode;
	@Column(length=12)
	private String dname;
	
	@ManyToOne
	@JoinColumn(name="lcode")
	private Location loc=new Location();

	public Department(int deptcode, String dname, Location loc) {
		super();
		this.deptcode = deptcode;
		this.dname = dname;
		this.loc = loc;
	}

	public Department() {
		
	}
	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
