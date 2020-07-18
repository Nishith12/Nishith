package com.mphasis.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@Column(length=10)
	private String lpcode;
	@Column(length=10)
	private String brand;
	@Column(length=10)
	private String processor;
	private int ramsize;
	private int hddsize;
	public Laptop(String lpcode, String brand, String processor, int ramsize, int hddsize) {
		super();
		this.lpcode = lpcode;
		this.brand = brand;
		this.processor = processor;
		this.ramsize = ramsize;
		this.hddsize = hddsize;
	}
	public Laptop() {
		
	}
	public String getLpcode() {
		return lpcode;
	}
	public void setLpcode(String lpcode) {
		this.lpcode = lpcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public int getHddsize() {
		return hddsize;
	}
	public void setHddsize(int hddsize) {
		this.hddsize = hddsize;
	}
	
	@Override
	public String toString() {
		return "Laptop [lpcode=" + lpcode + ", brand=" + brand + ", processor=" + processor + ", ramsize=" + ramsize
				+ ", hddsize=" + hddsize + "]";
	}
	
	
}
